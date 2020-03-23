package com.etz.replay.unit.factory;

import com.etz.replay.unit.bm.MustacheRuleUtil;
import com.etz.replay.unit.context.Invocation;
import com.etz.replay.unit.context.JsonUtil;
import com.etz.replay.unit.context.ParamInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.mustachejava.Mustache;
import lombok.SneakyThrows;

import java.io.File;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpecFactory {

    public static final Path OUT = Paths.get("C:\\data\\replay-unit\\src\\test\\groovy\\com\\etz");

    @SneakyThrows
    public static SpecModel buildFromJson(File subjectJson) {
        Invocation subjectInvocation = JsonUtil.readFrom(subjectJson);
        Class clazz = subjectInvocation.getClazz();
        String method = subjectInvocation.getMethod();


        SpecModel specModel = new SpecModel();
        specModel.name = clazz.getSimpleName();
        specModel.fileName = specModel.name + "Spec.groovy";
        specModel.method = method;
        specModel.subjectDecl = MustacheRuleUtil.render("def subject = new {{0}}()", clazz.getName());


        List<Invocation> children = subjectInvocation.children;
        if (!children.isEmpty()) {
            List<String> mockDecl = children.stream().flatMap(SpecFactory::buildMock).collect(Collectors.toList());
            specModel.mockDecl = mockDecl;
        }
        String loadArgs = MustacheRuleUtil.render("def subjectArgs = JsonUtil.readArgsFrom({{0}}).args", subjectInvocation.id);
        specModel.mockDecl.add(loadArgs);
        specModel.action = buildWhen(subjectInvocation);
        specModel.assertDecl = buildAssert(subjectInvocation);
        return specModel;
    }

    public static Stream<String> buildMock(Invocation invocation) {
        String mockRet = MustacheRuleUtil.render("def ret{{0}} = JsonUtil.readRetValuesFrom({{0}}).returned", invocation.id);
        String mockAssign = MustacheRuleUtil.render("subject.{{0}}=Mock({{1}})", invocation.refPath, invocation.getClazz().getName());
        String mockDel = MustacheRuleUtil.render("1 * subject.{{0}}.{{1}}(_) >> ret{{2}} ", invocation.refPath, invocation.method, invocation.id);

        return Arrays.asList(mockRet, mockAssign, mockDel).stream();
    }

    public static String buildWhen(Invocation invocation) {
        String action = MustacheRuleUtil.render("def ret=subject.{{0}}(*subjectArgs)", invocation.method, invocation.getClazz().getName());
        return action;
    }

    public static String buildAssert(Invocation invocation) {
        ParamInfo paramInfo = JsonUtil.readRetValuesFrom(invocation.id);
        return MustacheRuleUtil.render("ret == JsonUtil.readRetValuesFrom({{0}}).returned", invocation.id);
    }

    @SneakyThrows
    public static void main(String[] args) {
        /*File subjectJson = BASE.resolve("1.subject.json").toFile();

        SpecModel specModel = buildFromJson(subjectJson);
        String x = MustacheRuleUtil.renderSpec(specModel);
        System.out.println(x);
        Files.copy(new ByteArrayInputStream(x.getBytes("UTF-8")), OUT.resolve(specModel.fileName), StandardCopyOption.REPLACE_EXISTING);*/
        JsonNode jsonNode = JsonUtil.readJsonNode(5L);
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
}
