package com.etz.replay.unit.factory;

import lombok.Data;

@Data
public class ArgsModel {
    Class argType;
    Object argValue;

    @Override
    public String toString() {
        return "ArgsModel{" +
                "argType=" + argType +
                ", argValue=" + argValue +
                '}';
    }
}
