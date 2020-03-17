package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.Invocation;
import com.etz.replay.unit.context.InvocationContext;

public class AOuterServiceImpl implements AOuterService {
    @Override
    public String getAName(String aid) {

        return "name is A";
    }
}
