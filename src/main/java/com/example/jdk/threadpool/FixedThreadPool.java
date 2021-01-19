package com.example.jdk.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            fixedThreadPool.execute(() -> {
                System.out.println("当前线程：" + Thread.currentThread().getName());
            });
        }
    }
}
