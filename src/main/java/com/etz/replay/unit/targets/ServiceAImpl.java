package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.Provided;
import com.etz.replay.unit.context.TestSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@TestSubject
public class ServiceAImpl implements ServiceA {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(ServiceA.class);
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
        List<DataX> fx = IntStream.range(1, 3).parallel().peek(i -> {
            LOGGER.error(">>>" + i);
        }).mapToObj(i -> providerX.makeX(p1, "fx", 3))
                .collect(Collectors.toList());
        serviceData.dataX = fx.get(1);
        serviceData.fromServiceB = serviceB.doServiceB(fx.get(1));
        serviceData.fromServiceC = serviceC.doServiceC(p2);
        return serviceData;
    }
}
