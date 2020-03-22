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
    public ServiceData doServiceA(String p1, Integer p2) {
        ServiceData serviceData = new ServiceData();
        /*List<DataX> fx = forkJoinPool.submit(() -> IntStream.range(1, 300).parallel().peek(i -> {
            LOGGER.error(">>>" + i);
        }).mapToObj(i -> new DataX())).get().collect(Collectors.toList());*/

        List<DataX> fx = IntStream.range(1, 10).parallel().peek(i -> {
            LOGGER.error(">>>" + i);
        }).mapToObj(i -> providerX.makeX(p1, "x", i)).collect(Collectors.toList());
        serviceData.dataX = fx.get(1);
        serviceData.fromServiceB = serviceB.doServiceB(new DataX());
        serviceData.fromServiceC = serviceC.doServiceC(p2);
        return serviceData;
    }
}
