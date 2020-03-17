package com.etz.replay.unit;

import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.classmap.ClassManager;
import com.etz.replay.unit.targets.HelloWordTestServiceImpl;

import java.util.concurrent.TimeUnit;

public class App {


    public static void main(String[] args) throws Exception {
        ClassManager.initClassMap(HelloWordTestServiceImpl.class);
        BMUtil.loadAgent();
        BMUtil.submitFile("C:\\data\\replay-unit\\src\\main\\resources\\btm\\test.btm");
        for (int i = 0; i < 10; i++) {
            TimeUnit.SECONDS.sleep(3);
            new Thread(()-> System.out.println(" start..")).start();
        }
    }
}
