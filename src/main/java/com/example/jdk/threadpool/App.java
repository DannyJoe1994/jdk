package com.example.jdk.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] args) {

        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

        for (int i = 10; i > 0; i--) {
            singleThreadPool.submit(() -> {
                System.out.println("当前线程：" + Thread.currentThread().getName());
            });
        }





    }
}
