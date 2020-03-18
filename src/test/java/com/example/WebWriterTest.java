package com.example;

import org.jboss.byteman.contrib.bmunit.BMScript;
import org.jboss.byteman.contrib.bmunit.BMUnitConfig;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(org.jboss.byteman.contrib.bmunit.BMUnitRunner.class)

@BMUnitConfig(loadDirectory="target/test-classes")

@BMScript(value = "check.btm")
@Ignore
public class WebWriterTest {
}
