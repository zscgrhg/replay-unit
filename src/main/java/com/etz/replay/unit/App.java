package com.etz.replay.unit;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.classmap.SubjectContext;
import com.etz.replay.unit.targets.HelloWordTestService;
import com.etz.replay.unit.targets.HelloWordTestServiceImpl;
import com.etz.replay.unit.targets.ProvidedA;

import java.util.concurrent.TimeUnit;

public class App {


    public static void main(String[] args) throws Exception {
        String pkg = "com.etz.replay.unit.targets";


        BMUtil.loadAgent();
        SubjectContext.loadFromPkg(pkg);

        TimeUnit.SECONDS.sleep(1);
        for (int i = 0; i < 1; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                HelloWordTestService subject = new HelloWordTestServiceImpl();
                String s = subject.doBusiness("argv" + i, new ProvidedA());
                System.out.println(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
