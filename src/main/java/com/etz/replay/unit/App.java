package com.etz.replay.unit;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.classmap.ClassManager;
import com.etz.replay.unit.targets.HelloWordTestService;
import com.etz.replay.unit.targets.HelloWordTestServiceImpl;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class App {


    public static void main(String[] args) throws Exception {


        ClassManager.initClassMap(HelloWordTestServiceImpl.class);
        BMUtil.loadAgent();
        BMUtil.submitFile("C:\\data\\replay-unit\\src\\main\\resources\\btm\\test.btm");
        for (int i = 0; i < 1; i++) {
            TimeUnit.SECONDS.sleep(1);
            HelloWordTestService subject=new HelloWordTestServiceImpl();
            String s = subject.doBusiness("argv" + i);
            System.out.println(s);
        }
    }
}
