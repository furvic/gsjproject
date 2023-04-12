package com.ujiuye.homework;

import java.io.ObjectInputStream;
import java.util.Random;

public class Bus implements Runnable{
    Random ran = new Random();
    int num = 80;
    @Override
    public void run() {
        while (num > 0){
            synchronized (ran){
                if(num > 0){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int a = ran.nextInt(num) + 1;
                    num = num - a;
                    if(num > 80 || num < 0){
                        break;
                    }
                        System.out.println(Thread.currentThread().getName() + " 已经上了" + a +"位乘客，还剩" + num + "个座位,");
                }
            }

        }
    }
}
