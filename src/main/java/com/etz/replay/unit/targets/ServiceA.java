package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.TestSubject;

@TestSubject
public interface ServiceA {
    ServiceData doServiceA(String p1, Integer p2);
}
