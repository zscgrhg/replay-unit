package com.etz.replay.unit.classmap;

import lombok.Data;

@Data
public class RefsInfo {
    public RefType type;
    public String name;
    public int index;
    public Class declaredType;


    public enum RefType {
        FIELD,
        ARG
    }
}
