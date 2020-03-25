package com.etz.replay.unit.targets;

import com.etz.replay.unit.context.Provided;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ServiceAImpl implements ServiceA {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(ServiceA.class);
    ForkJoinPool forkJoinPool = new ForkJoinPool(5);
    @Provided
    ProviderX providerX = new ProviderXImpl();
    @Provided
    ProviderXImpl providerX2 = new ProviderXImpl();
    @Provided
    ServiceC serviceC = new ServiceCImpl();

    @Provided
    ServiceB serviceB = new ServiceBImpl();

    @Override
    @SneakyThrows
    public ServiceData doServiceA(String p1, Integer p2, DataX p3) {
        ServiceData serviceData = new ServiceData();
        List<DataX> fx = IntStream.range(1, 10).parallel().peek(i -> {
            LOGGER.error(">>>" + i);
        }).mapToObj(i -> providerX.makeX(p1, "x", i)).collect(Collectors.toList());

        serviceData.dataX = fx.get(1);
        serviceData.fromServiceB = serviceB.doServiceB(new DataX());
        serviceData.fromServiceC = serviceC.doServiceC(p2);
        return serviceData;
    }

    @Override
    public ServiceData doServiceA2(String p1, Integer p2, DataX p3) {
        List<ServiceData> ret = IntStream.range(1, 3).mapToObj(i -> {
            ServiceData serviceData = new ServiceData();
            serviceData.fromServiceB = serviceB.doServiceB(new DataX());
            //嵌套并行有BUG
            List<DataX> fx = IntStream.range(1, 10).parallel().peek(x -> {
                LOGGER.error(">>>" + i);
            }).mapToObj(y -> providerX.makeX(p1, "x", y)).collect(Collectors.toList());

            serviceData.dataX = fx.get(1);

            serviceData.fromServiceC = serviceC.doServiceC(p2);
            return serviceData;
        }).collect(Collectors.toList());
        return ret.get(0);
    }
}
