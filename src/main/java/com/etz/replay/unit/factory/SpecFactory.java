package com.etz.replay.unit.factory;

import com.etz.replay.unit.bm.MustacheRuleUtil;
import com.etz.replay.unit.context.Invocation;
import com.etz.replay.unit.context.JsonUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.mustachejava.Mustache;
import lombok.SneakyThrows;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecFactory {

    public static final Path OUT = Paths.get("src\\test\\groovy\\com\\etz")
            .resolve("pkg" + new SimpleDateFormat("yyyyMMddHmmss").format(new Date()));

    static {
        File file = OUT.toFile();
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    @SneakyThrows
    public static SpecModel buildFromJson(File subjectJson) {
        Invocation subjectInvocation = JsonUtil.readFrom(subjectJson);
        Class clazz = subjectInvocation.getClazz();
        String method = subjectInvocation.getMethod();


        SpecModel specModel = new SpecModel();
        specModel.name = clazz.getSimpleName();
        specModel.id = subjectInvocation.id;
        specModel.method = method;
        specModel.fileName = specModel.name + method + specModel.id + "Spec.groovy";
        specModel.subjectDecl = MustacheRuleUtil.render("def subject = new {{0}}()", clazz.getName());


        List<Invocation> children = subjectInvocation.children;

        Map<String, List<LineModel>> inputs = new HashMap<>();
        Map<String, List<LineModel>> outputs = new HashMap<>();
        Map<String, List<LineModel>> returned = new HashMap<>();

        inputs.put(String.valueOf(subjectInvocation.id), buildArgsLine(JsonUtil.readInJsonNode(subjectInvocation.id)));
        outputs.put(String.valueOf(subjectInvocation.id), buildArgsLine(JsonUtil.readOutJsonNode(subjectInvocation.id)));
        returned.put(String.valueOf(subjectInvocation.id), buildRetLine(JsonUtil.readOutJsonNode(subjectInvocation.id)));


        if (!children.isEmpty()) {

            Map<String, List<Invocation>> mapInv = new HashMap<>();
            for (Invocation child : children) {
                inputs.put(String.valueOf(child.id), buildArgsLine(JsonUtil.readInJsonNode(child.id)));
                outputs.put(String.valueOf(child.id), buildArgsLine(JsonUtil.readOutJsonNode(child.id)));
                returned.put(String.valueOf(child.id), buildRetLine(JsonUtil.readOutJsonNode(child.id)));
                String refPath = child.getRefPath();
                mapInv.putIfAbsent(refPath, new ArrayList<>());
                mapInv.get(refPath).add(child);
            }

            List<String> mockBlock = mapInv.entrySet().stream().flatMap(e -> buildMockBlock(e).stream()).collect(Collectors.toList());

            specModel.mockDecl = mockBlock;

        }

        trim(inputs);
        trim(outputs);
        trim(returned);
        specModel.Inputs = inputs.entrySet();
        specModel.Outputs = outputs.entrySet();
        specModel.Returned = returned.entrySet();
        specModel.action = buildWhen(subjectInvocation);
        specModel.assertDecl = buildAssert(subjectInvocation);
        return specModel;
    }

    public static void trim(Map<String, List<LineModel>> map) {
        Collection<List<LineModel>> values = map.values();
        for (List<LineModel> lineModels : values) {
            if (lineModels != null && !lineModels.isEmpty()) {
                lineModels.get(lineModels.size() - 1).sp = null;
            }
        }
    }

    public static List<String> buildMockBlock(Map.Entry<String, List<Invocation>> invs) {
        List<String> ret = new ArrayList<>();
        List<Invocation> value = invs.getValue();
        Class clazz = value.get(0).getClazz();
        ret.add(MustacheRuleUtil.render("subject.{{0}}=Mock({{1}}){", invs.getKey(), clazz.getName()));
        for (Invocation invocation : value) {
            String args = invocation.getMethodSignure().replaceAll("^.*\\((.*?)\\)", "$1");
            int length = args.split(",").length;
            String argsLine = IntStream.range(0, length).mapToObj(i -> "{p" + i + "-> p" + i + "==INPUTS{{1}}[" + i + "]}").collect(Collectors.joining(","));
            ret.add(MustacheRuleUtil.render("1 * {{0}}(" + argsLine + ") >> RETURNED{{1}} ", invocation.method, invocation.id));
        }
        ret.add("}");
        return ret;
    }


    public static String buildWhen(Invocation invocation) {
        String action = MustacheRuleUtil.render("def ret=subject.{{0}}(*INPUTS{{1}})", invocation.method, invocation.id);
        return action;
    }

    public static String buildAssert(Invocation invocation) {


        return MustacheRuleUtil.render("ret == RETURNED{{0}}", invocation.id);
    }


    public static void test1() {
         /*File subjectJson = BASE.resolve("1.subject.json").toFile();

        SpecModel specModel = buildFromJson(subjectJson);
        String x = MustacheRuleUtil.renderSpec(specModel);
        System.out.println(x);
        Files.copy(new ByteArrayInputStream(x.getBytes("UTF-8")), OUT.resolve(specModel.fileName), StandardCopyOption.REPLACE_EXISTING);*/
        JsonNode jsonNode = JsonUtil.readInJsonNode(5L);
        JsonNode argsData = jsonNode.get("args");
        ArrayNode argsDataArr = (ArrayNode) argsData;
        JsonNode valuesType = jsonNode.get("valuesType");
        ArrayNode valueArray = (ArrayNode) valuesType;
        List<String> argsModels = new ArrayList<>();
        for (int i = 0; i < valuesType.size(); i++) {

            JsonNode value = argsDataArr.get(i);
            JsonNode ty = valueArray.get(i);
            String text = ty.asText();
            if (value.isTextual()) {
                argsModels.add(MustacheRuleUtil.render("'{{0}}'  ", value.asText()));
            } else if (value.isValueNode()) {
                argsModels.add(MustacheRuleUtil.render("{{0}}", value.asText()));
            } else {
                argsModels.add("[");
                Iterator<String> names = value.fieldNames();
                while (names.hasNext()) {
                    String next = names.next();
                    argsModels.add(MustacheRuleUtil.render("{{0}}:'{{1}}'", next, value.get(next).asText()));
                }
                argsModels.add(MustacheRuleUtil.render("] as {{0}}", text));
            }
        }


        StringWriter sw = new StringWriter();
        Mustache mustache = MustacheRuleUtil.mf.compile("btm/inputs.mustache");
        mustache.execute(sw, Collections.singletonMap("Inputs", argsModels));
        sw.flush();
        System.out.println(sw.toString());
    }

    public static List<LineModel> buildRetLine(JsonNode paramInfoJson) {
        List<LineModel> llm = new ArrayList<>();
        JsonNode returned = paramInfoJson.get("returned");
        JsonNode rvt = paramInfoJson.get("returnedValueType");
        llm.addAll(buildArgDef(1, null, returned, rvt.asText()));
        return llm;
    }

    public static List<LineModel> buildArgsLine(JsonNode paramInfoJson) {
        List<LineModel> llm = new ArrayList<>();
        JsonNode args = paramInfoJson.get("args");
        ArrayNode argValues = (ArrayNode) args;
        JsonNode vt = paramInfoJson.get("valuesType");
        ArrayNode vtArr = (ArrayNode) vt;
        if (argValues != null && argValues.size() > 0) {
            for (int i = 0; i < argValues.size(); i++) {
                llm.addAll(buildArgDef(1, null, argValues.get(i), vtArr.get(i).asText()));
            }

        }
        return llm;
    }

    @SneakyThrows
    public static List<LineModel> buildArgDef(int ident, String name, JsonNode value, String clazz) {
        ident++;
        String identStr = IntStream.range(0, ident).mapToObj(i -> "\t").collect(Collectors.joining());
        List<LineModel> defs = new ArrayList<>();
        if (value.isArray()) {
            defs.add(new PropLineModel(identStr, name, "[", null));
            ArrayNode vArr = (ArrayNode) value;
            for (int i = 0; i < vArr.size(); i++) {
                defs.addAll(buildArgDef(ident, null, vArr.get(i), Class.forName(clazz).getComponentType().getName()));
            }
            defs.add(new PropLineModel(identStr, null, "]"));
            return defs;
        } else if (value == null) {
            defs.add(new PropLineModel(identStr, name, "null"));
        } else if (value.isTextual()) {
            String line = MustacheRuleUtil.render("'{{0}}'  ", value.asText());
            defs.add(new PropLineModel(identStr, name, line));
        } else if (value.isValueNode()) {
            String vnLine = MustacheRuleUtil.render("{{0}}", value.asText());
            defs.add(new PropLineModel(identStr, name, vnLine));
        } else {
            assert value.isObject();
            defs.add(new PropLineModel(identStr, name, "[", null));
            Iterator<String> names = value.fieldNames();
            while (names.hasNext()) {
                String nextName = names.next();
                JsonNode subNode = value.get(nextName);
                Class fieldType = findFieldType(Class.forName(clazz), nextName);
                defs.addAll(buildArgDef(ident, nextName, subNode, fieldType.getName()));
            }
            String ObjectEndLine = MustacheRuleUtil.render("] as {{0}}", clazz);
            defs.add(new PropLineModel(identStr, null, ObjectEndLine));
        }
        return defs;
    }

    public static Class findFieldType(Class clazz, String name) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getName().equals(name)) {
                return field.getType();
            }
        }
        return null;
    }


    @SneakyThrows
    public static void main(String[] args) {
        /*JsonNode jsonNode = JsonUtil.readOutJsonNode(5L);
        List<LineModel> lineModels = buildArgsLine(jsonNode);
        lineModels.get(lineModels.size()-1).sp=null;
        System.out.println(MustacheRuleUtil.buildRule("btm/fdef.mustache", Collections.singletonMap("lines", lineModels)));*/

        File[] subjects = JsonUtil.BASE.toFile().listFiles(fn -> fn.getName().endsWith(".subject.json"));
        for (File subjectJson : subjects) {

            SpecModel specModel = buildFromJson(subjectJson);
            String x = MustacheRuleUtil.renderSpec(specModel);
            System.out.println(x);
            Files.copy(new ByteArrayInputStream(x.getBytes("UTF-8")), OUT.resolve(specModel.fileName), StandardCopyOption.REPLACE_EXISTING);

        }


    }
}
