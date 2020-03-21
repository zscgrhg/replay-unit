package com.etz.replay.unit.targets;

public class ProviderYImpl implements ProviderY {
    @Override
    public DataY makeY(String fieldFromY, String dataFromY) {
        DataY data = new DataY();
        data.dataFromY = dataFromY;
        data.fieldFromY = fieldFromY;
        return data;
    }
}
