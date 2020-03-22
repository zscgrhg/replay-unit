package com.etz.replay.unit.classmap;

import com.etz.replay.unit.context.TestSubject;

import java.lang.annotation.Annotation;
import java.util.stream.Stream;

public class DefaultTestSubjectSelectorImpl implements TestSubjectSelector {
    @Override
    public boolean select(Class clazz) {
        return hasAnnotation(clazz, TestSubject.class);
    }

    public boolean hasAnnotation(Class target, Class anno) {
        if (target == null || Object.class.equals(target)) {
            return false;
        }
        Annotation[] annotations = target.getAnnotationsByType(anno);
        return (annotations != null && annotations.length > 0) ||
                hasAnnotation(target.getSuperclass(), anno) ||
                Stream.of(target.getInterfaces()).anyMatch(sf -> hasAnnotation(sf, anno));

    }
}
