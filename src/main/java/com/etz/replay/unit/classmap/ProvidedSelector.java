package com.etz.replay.unit.classmap;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public interface ProvidedSelector {
    boolean selectField(Class clazz, Field field);

    boolean selectArg(Class clazz, Method method, Parameter p);
}
