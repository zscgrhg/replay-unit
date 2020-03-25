package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.TestSubject;

import java.util.List;

@TestSubject
public interface ServiceA {
    ServiceData doServiceA(String p1, Integer p2, DataX p3);

    List<ServiceData> doServiceA2(String p1, Integer p2, DataX p3);
}
