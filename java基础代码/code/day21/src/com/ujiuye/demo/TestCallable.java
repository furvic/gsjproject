package com.ujiuye.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable my = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(my);
        Thread th = new Thread(ft);
        th.start();

        for(int i = 1; i <= 10; i ++){
            System.out.println("main------" + i);
        }

        System.out.println(ft.get());

    }
}
