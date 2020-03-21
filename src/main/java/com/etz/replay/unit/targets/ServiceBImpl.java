package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.TestSubject;

@TestSubject
public class ServiceBImpl implements ServiceB {

    //ProviderY providerY=new ProviderYImpl();

    @Override
    public String doServiceB(DataX dataX) {
        return dataX.dataFromX + "<>" + dataX.fieldFromX;
    }
}
