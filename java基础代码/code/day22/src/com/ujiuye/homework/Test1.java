package com.ujiuye.homework;

import java.util.Random;

public class Test1 implements Runnable{
    int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
    int length = arr.length;
    boolean[] bo = new boolean[arr.length];
    Random ran = new Random();
    @Override
    public void run() {
        while(length > 0){
            synchronized("abc"){
                int index = ran.nextInt(arr.length);
                if(bo[index] == false){
                    bo[index] = true;
                    System.out.println(Thread.currentThread().getName() + "又产生了一个" + arr[index] + "元大奖。");
                    length--;
                }
            }
        }
    }
}
