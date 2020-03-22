package com.etz.replay.unit.bm;

import lombok.Data;

import java.lang.reflect.Method;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class RuleScope {
    public static final String TYPE_INTERFACE = "INTERFACE";
    public static final String TYPE_CLASS = "CLASS";
    String className;
    String methodSignure;
    String method;
    String methodSimpleName;
    String argsType;
    String reType;
    String TYPE;

    public RuleScope(Class clazz, Method method) {

        this.className = clazz.getName();
        String gs = method.toGenericString();
        this.methodSignure = gs;
        this.reType = method.getReturnType().getName();
        int argStart = gs.indexOf('(');
        int argEnd = gs.indexOf(')');
        String noArgString = gs.substring(0, argStart);
        this.argsType = "new Class[]{" + Stream.of(gs.substring(argStart + 1, argEnd).split(",")).map(String::trim)
                .filter(s -> !s.isEmpty()).map(s -> s.concat(".class")).collect(Collectors.joining(",")) + "}";
        int idx = noArgString.lastIndexOf('.') + 1;
        this.method = gs.substring(idx);
        this.methodSimpleName = noArgString.substring(idx);
        if (clazz.isInterface()) {
            this.TYPE = TYPE_INTERFACE;
        } else {
            this.TYPE = TYPE_CLASS;
        }
    }
}
