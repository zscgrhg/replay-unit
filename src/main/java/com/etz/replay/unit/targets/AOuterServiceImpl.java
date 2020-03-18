package com.etz.replay.unit.targets;

public class AOuterServiceImpl implements AOuterService {
    @Override
    public String getAName(String[] aid) {
        for (int i = 0; i < aid.length; i++) {
            aid[i] = "haa!!" + aid[i];
        }

        return "shout";
    }
}
