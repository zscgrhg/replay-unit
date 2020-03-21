package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.Provided;
import com.etz.replay.unit.context.TestSubject;

@TestSubject
public class ServiceAImpl implements ServiceA {
    @Provided
    ProviderX providerX = new ProviderXImpl();
    @Provided
    ProviderXImpl providerX2 = new ProviderXImpl();
    @Provided
    ServiceC serviceC = new ServiceCImpl();

    @Provided
    ServiceB serviceB = new ServiceBImpl();

    @Override
    public ServiceData doServiceA(String p1, Integer p2) {
        ServiceData serviceData = new ServiceData();
        DataX dataX = providerX.makeX(p1, "fx", 3);
        serviceData.dataX = dataX;
        serviceData.fromServiceB = serviceB.doServiceB(dataX);
        serviceData.fromServiceC = serviceC.doServiceC(p2);
        return serviceData;
    }
}
