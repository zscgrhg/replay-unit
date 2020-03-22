package com.etz.replay.unit;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.classmap.SubjectContext;
import com.etz.replay.unit.context.JsonUtil;
import com.etz.replay.unit.targets.ServiceA;
import com.etz.replay.unit.targets.ServiceAImpl;
import com.etz.replay.unit.targets.ServiceData;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {


    public static void main(String[] args) throws Exception {
        String pkg = "com.etz.replay.unit.targets";


        BMUtil.loadAgent();
        SubjectContext.loadFromPkg(pkg);

        TimeUnit.SECONDS.sleep(3);
        ServiceA serviceA = new ServiceAImpl();
        List<ServiceData> collect = IntStream.range(1, 2).parallel().mapToObj(x -> {
            ServiceData serviceData = serviceA.doServiceA("t" + x, x);
            System.out.println(JsonUtil.toJsonString(serviceData));
            return serviceData;
        }).collect(Collectors.toList());
    }
}
