package com.etz.replay.unit.bm;

import com.alibaba.ttl.threadpool.TtlForkJoinPoolHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class TtlUtil {
    public static final ThreadLocal<Map<String, Integer>> BARRIER = new ThreadLocal<>();


    public static ForkJoinWorkerThread getFJPWrapper(ForkJoinPool.ForkJoinWorkerThreadFactory threadFactory, ForkJoinPool pool) {
        ForkJoinWorkerThread forkJoinWorkerThread = TtlForkJoinPoolHelper.getDisableInheritableForkJoinWorkerThreadFactory(threadFactory).newThread(pool);
        return forkJoinWorkerThread;
    }

    public static boolean setBarrier(String barrier) {
        Map<String, Integer> barrierMap = BARRIER.get();
        if (barrierMap == null) {
            barrierMap = new HashMap<>();
            BARRIER.set(barrierMap);
        }
        Integer exist = barrierMap.get(barrier);
        if (exist == null) {
            barrierMap.put(barrier, 1);
            return true;
        }
        return false;
    }

    public static void cleanBarrier(String barrier) {
        Map<String, Integer> barrierMap = BARRIER.get();
        if (barrierMap == null) {
            return;
        }
        barrierMap.remove(barrier);
        if (barrierMap.isEmpty()) {
            BARRIER.remove();
        }
    }


}
