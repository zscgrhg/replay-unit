package com.etz.replay.unit.classmap;

import com.etz.replay.unit.context.TestSubject;

public class DefaultTestSubjectSelectorImpl implements TestSubjectSelector {
    @Override
    public boolean select(Class clazz) {
        return clazz.isAnnotationPresent(TestSubject.class);
    }
}
