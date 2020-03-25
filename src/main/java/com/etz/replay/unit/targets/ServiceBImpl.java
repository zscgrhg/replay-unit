package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.TestSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TestSubject
public class ServiceBImpl implements ServiceB {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceBImpl.class);
    //ProviderY providerY=new ProviderYImpl();

    @Override
    public String doServiceB(DataX dataX) {
        //InvocationContext
        return dataX.dataFromX + "<>" + dataX.fieldFromX;
    }
}
