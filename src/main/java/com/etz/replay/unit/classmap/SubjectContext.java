package com.etz.replay.unit.classmap;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.bm.MustacheRuleUtil;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SubjectContext {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(SubjectContext.class);


    public static final Map<Class, Map<String, ObjectInfoProtype>> SUBJECT_CLASS_CONTEXT = new ConcurrentHashMap<>();
    public static final ThreadLocal<Stack<SubjectInfo>> SUBJECT_REFS_CONTEXT = new ThreadLocal<>();
    static TestSubjectSelector tss = new DefaultTestSubjectSelectorImpl();
    static ProvidedSelector ps = new DefaultProvidedSelectorImpl();

    @SneakyThrows
    public static void saveObjectsRef(Object subject, String methodSignure, Object[] args) {
        Class<?> aClass = subject.getClass();
        boolean isSubject = isSubject(aClass);
        if (isSubject) {
            SubjectInfo subjectInfo = new SubjectInfo();
            subjectInfo.setSubject(subject);
            Map<String, ObjectInfoProtype> refMap = SUBJECT_CLASS_CONTEXT.get(aClass);
            Map<String, Object> argMap = new HashMap<>();
            if (args != null && args.length > 0) {

                for (int i = 0; i < args.length; i++) {
                    argMap.put(keyOfArgs(methodSignure, i), args[i]);
                }
            }

            Map<Object, ObjectInfoProtype> refs = subjectInfo.getRefs();
            Set<Map.Entry<String, ObjectInfoProtype>> entries = refMap.entrySet();
            for (Map.Entry<String, ObjectInfoProtype> entry : entries) {
                String key = entry.getKey();
                ObjectInfoProtype value = entry.getValue();
                if (value.type.equals(ObjectInfoProtype.Type.ARG)) {
                    refs.put(argMap.get(key), value);
                } else if (value.type.equals(ObjectInfoProtype.Type.FIELD)) {
                    Field field = aClass.getDeclaredField(value.name);
                    field.setAccessible(true);
                    Object feildValue = field.get(subject);
                    refs.put(feildValue, value);
                }
            }
            Stack<SubjectInfo> stack = SUBJECT_REFS_CONTEXT.get();
            if (stack == null) {
                stack = new Stack<>();
                SUBJECT_REFS_CONTEXT.set(stack);
            }
            stack.push(subjectInfo);
        }
    }

    public static void cleanObjectsRef(Object subject) {
        Class<?> aClass = subject.getClass();
        boolean isSubject = isSubject(aClass);

        if (isSubject) {
            Stack<SubjectInfo> stack = SUBJECT_REFS_CONTEXT.get();
            SubjectInfo subjectInfo = stack.lastElement();

            if (stack != null) {
                assert Objects.equals(subjectInfo.getSubject(), subject);
                stack.pop();
            }
        }
    }

    public static String refPathOf(Object thisRef) {
        Stack<SubjectInfo> stack = SUBJECT_REFS_CONTEXT.get();
        if (stack != null && !stack.isEmpty()) {
            SubjectInfo subjectInfo = stack.lastElement();
            Map<Object, ObjectInfoProtype> refs = subjectInfo.getRefs();

            ObjectInfoProtype protype = refs.get(thisRef);
            if (protype != null) {
                return protype.name;
            }
        }
        return null;
    }

    public static void loadFromPkg(String... pkg) {

        try (ScanResult scanResult =
                     new ClassGraph()
                             .enableAllInfo()
                             .whitelistPackages(pkg)
                             .scan()) {
            ClassInfoList clzInpkg = scanResult.getAllClasses();
            List<Class<?>> classes = clzInpkg.loadClasses();
            parse(classes);
        }
    }

    public static void parse(List<Class<?>> classList) {
        for (Class clz : classList) {

            if (tss.select(clz)) {
                BMUtil.submitText(MustacheRuleUtil.buildRuleForClass(clz));
                SUBJECT_CLASS_CONTEXT.putIfAbsent(clz, new HashMap<>());
                Field[] fields = clz.getDeclaredFields();

                for (Field field : fields) {
                    if (ps.selectField(clz, field)) {
                        Map<String, ObjectInfoProtype> subMap = SUBJECT_CLASS_CONTEXT.get(clz);
                        ObjectInfoProtype obj = new ObjectInfoProtype();
                        obj.setType(ObjectInfoProtype.Type.FIELD);
                        Class<?> type = field.getType();
                        BMUtil.submitText(MustacheRuleUtil.buildRuleForClass(type));
                        obj.setDeclaredType(type);
                        obj.setName(field.getName());
                        subMap.put(field.getName(), obj);
                    }
                }

                Method[] methods = clz.getDeclaredMethods();
                for (Method method : methods) {
                    parseMethod(clz, method);
                }
            }
        }

    }

    public static void parseMethod(Class clz, Method method) {
        Parameter[] parameters = method.getParameters();
        if (parameters == null) {
            return;
        }
        for (int i = 0; i < parameters.length; i++) {
            Parameter param = parameters[i];
            if (ps.selectArg(clz, method, param)) {
                Map<String, ObjectInfoProtype> subMap = SUBJECT_CLASS_CONTEXT.get(clz);
                ObjectInfoProtype obj = new ObjectInfoProtype();
                obj.setType(ObjectInfoProtype.Type.ARG);
                Class<?> type = param.getType();
                BMUtil.submitText(MustacheRuleUtil.buildRuleForClass(type));
                obj.setDeclaredType(type);
                obj.setName(param.getName());
                obj.setIndex(i);
                subMap.put(keyOfArgs(method.toGenericString(), i), obj);
            }
        }
    }

    public static String keyOfArgs(String methodSignure, int idx) {
        return methodSignure + "[" + idx + "]";
    }

    public static boolean isSubject(Class clazz) {
        return tss.select(clazz);
    }


}
