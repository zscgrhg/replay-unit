package com.etz.replay.unit.context;

import lombok.Data;

@Data
public class ParamInfo {
    Long invocationId;
    Object[] args;
    String name;
    Object returned;
    Throwable thrown;
    String exception;
}
