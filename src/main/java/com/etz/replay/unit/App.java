package com.etz.replay.unit;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.etz.replay.unit.bm.BMUtil;
import com.etz.replay.unit.context.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class App {
    public static final TransmittableThreadLocal<Stack<Integer>> SUBJECT_REFS_CONTEXT = new TransmittableThreadLocal<>();

    private static final Logger LOGGER
            = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        String pkg = "com.etz.replay.unit.targets";

        ForkJoinPool.ForkJoinWorkerThreadFactory forkJoinWorkerThreadFactory;
        BMUtil.loadAgent();
        BMUtil.submitFile("C:\\data\\replay-unit\\src\\main\\resources\\btm\\exec.btm");
        SUBJECT_REFS_CONTEXT.set(new Stack<>());
        ExecutorService executorService = Executors.newFixedThreadPool(30);
        for (int i = 0; i < 1000; i++) {
//com.etz.replay.unit.bm.TtlUtil.setBarrier("^Executor.execute")
            int varI = i;
            executorService
                    .execute(new Runnable() {
                        @Override
                        public void run() {
                            SUBJECT_REFS_CONTEXT.get().push(varI);
                            LOGGER.error(">>>");
                        }
                    });
        }
        System.out.println(JsonUtil.toJsonString(SUBJECT_REFS_CONTEXT.get()));
        executorService.shutdown();

       /* for (int i = 0; i < 10; i++) {
            String string = new String("test"+i);
            ServiceA serviceA = new ServiceAImpl();
            ServiceData serviceData = serviceA.doServiceA("", 1);
        }*/
        /*SubjectContext.loadFromPkg(pkg);

        TimeUnit.SECONDS.sleep(3);
        ServiceA serviceA = new ServiceAImpl();
        List<ServiceData> collect = IntStream.range(1, 2).parallel().mapToObj(x -> {
            ServiceData serviceData = serviceA.doServiceA("t" + x, x);
            System.out.println(JsonUtil.toJsonString(serviceData));
            return serviceData;
        }).collect(Collectors.toList());*/
    }
}
