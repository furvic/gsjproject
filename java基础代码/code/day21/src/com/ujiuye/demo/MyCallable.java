package com.ujiuye.demo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i;
        for(i = 1; i <= 10; i ++){
            System.out.println("Callable------" + i);
        }
        return i;
    }
}
