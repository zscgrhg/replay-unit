package com.etz.replay.unit;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.classmap.SubjectContext;
import com.etz.replay.unit.context.JsonUtil;
import com.etz.replay.unit.targets.ServiceA;
import com.etz.replay.unit.targets.ServiceAImpl;
import com.etz.replay.unit.targets.ServiceData;

import java.util.concurrent.TimeUnit;

public class App {


    public static void main(String[] args) throws Exception {
        String pkg = "com.etz.replay.unit.targets";


        BMUtil.loadAgent();
        SubjectContext.loadFromPkg(pkg);

        TimeUnit.SECONDS.sleep(3);
        ServiceA serviceA = new ServiceAImpl();
        for (int i = 0; i < 1; i++) {
            ServiceData serviceData = serviceA.doServiceA("t" + i, i);
            System.out.println(JsonUtil.toJsonString(serviceData));
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
