package com.etz.replay.unit.targets;

public class ProviderZImpl implements ProviderZ {
    @Override
    public DataZ makeZ(String fieldFromZ, String dataFromZ) {
        DataZ data = new DataZ();
        data.dataFromZ = fieldFromZ;
        data.fieldFromZ = fieldFromZ;
        return data;
    }
}
