package com.etz.replay.unit.context;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class ParamInfo {
    Long invocationId;
    Object[] args;
    Class[] valuesType;
    Class[] argsType;
    String name;
    Object returned;
    Class returnedValueType;
    Throwable thrown;
    String exception;

    public static Class[] valuesTypeOf(Class[] argsType, Object[] args) {
        int length = argsType.length;
        Class[] ret = new Class[length];
        for (int i = 0; i < length; i++) {
            Class clazz = argsType[i];
            Object argi = args[i];
            ret[i] = typeOf(clazz, argi);
        }
        return ret;
    }

    public static Class typeOf(Class t, Object v) {
        if (t.isPrimitive() || v == null) {
            return t;
        } else {
            return v.getClass();
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(Class.forName("int"));


    }
}
