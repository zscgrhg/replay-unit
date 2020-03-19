package com.etz.replay.unit.classmap;

import com.etz.replay.unit.context.Provided;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class DefaultProvidedSelectorImpl implements ProvidedSelector {
    @Override
    public boolean selectField(Class clazz, Field field) {
        return field.isAnnotationPresent(Provided.class);
    }

    @Override
    public boolean selectArg(Class clazz, Method method, Parameter p) {
        return p.isAnnotationPresent(Provided.class);
    }
}
