package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.TestSubject;

@TestSubject
public class ServiceCImpl implements ServiceC {
    @Override
    public Integer doServiceC(int seed) {
        return seed * seed;
    }
}
