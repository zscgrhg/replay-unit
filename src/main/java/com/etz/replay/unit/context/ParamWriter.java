package com.etz.replay.unit.context;

public interface ParamWriter {
    void write(ParamInfo paramInfo);
    void write(InvocationContext context);
}
