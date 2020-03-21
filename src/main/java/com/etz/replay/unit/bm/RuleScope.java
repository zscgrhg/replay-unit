package com.etz.replay.unit.bm;

import lombok.Data;

import java.lang.reflect.Method;

@Data
public class RuleScope {
    public static final String TYPE_INTERFACE = "INTERFACE";
    public static final String TYPE_CLASS = "CLASS";
    String className;
    String methodSignure;
    String method;
    String methodSimpleName;
    String TYPE;

    public RuleScope(Class clazz, Method method) {

        this.className = clazz.getName();
        String gs = method.toGenericString();
        this.methodSignure = gs;
        String noArgString = gs.substring(0, gs.indexOf('('));
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
