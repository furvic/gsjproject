package com.ujiuye.demo;

public class MyRunnble implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i<= 10; i++){
            System.out.println("runnable----" + i);
        }
    }
}
