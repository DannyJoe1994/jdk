package com.example.jdk.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

        executorService.scheduleWithFixedDelay(() -> {
            System.out.println("当前线程：" + Thread.currentThread().getName());
        }, 1L, 1L, TimeUnit.SECONDS);
    }
}
