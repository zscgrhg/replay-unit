package com.etz.replay.unit.classmap;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.bm.MustacheRuleUtil;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfoList;
import io.github.classgraph.ScanResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SubjectContext {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(SubjectContext.class);


    public static final Map<Class, Map<String, RefsInfo>> SUBJECT_CLASS_CONTEXT = new ConcurrentHashMap<>();

    static TestSubjectSelector tss = new DefaultTestSubjectSelectorImpl();
    static ProvidedSelector ps = new DefaultProvidedSelectorImpl();


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
                        Map<String, RefsInfo> subMap = SUBJECT_CLASS_CONTEXT.get(clz);
                        RefsInfo obj = new RefsInfo();
                        obj.setType(RefsInfo.RefType.FIELD);
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
                Map<String, RefsInfo> subMap = SUBJECT_CLASS_CONTEXT.get(clz);
                RefsInfo obj = new RefsInfo();
                obj.setType(RefsInfo.RefType.ARG);
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
