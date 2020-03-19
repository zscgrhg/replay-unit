package com.etz.replay.unit.context;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Provided
@Target({ElementType.TYPE})
public @interface TestSubject {
}
