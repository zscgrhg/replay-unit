package com.etz.replay.unit.classmap;

import lombok.Data;

@Data
public class ObjectInfo {
    Type type;
    String name;
    int index;
    Class declaredType;

    enum Type {
        FIELD,
        ARG
    }
}
