package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.TestSubject;

@TestSubject
public class AOuterServiceImpl implements AOuterService {
    @Override
    public String getAName(String[] aid) {
        for (int i = 0; i < aid.length; i++) {
            aid[i] = "haa!!" + aid[i];
        }
        return "shout";
    }
}
