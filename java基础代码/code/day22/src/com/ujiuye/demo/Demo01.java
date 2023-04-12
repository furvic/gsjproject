package com.ujiuye.demo;

import java.io.ObjectInputStream;

public class Demo01 {
   static Object A = new Object();
   static  Object B = new Object();
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                synchronized (A){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我已经获取到线程A，还要获取到线程B.");
                    synchronized (B){
                        System.out.println("A和B都获取到了，厉害死了！");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (B){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我已经获取到线程B，还要获取到线程A.");
                    synchronized (A){
                        System.out.println("A和B都获取到了，厉害死了！");
                    }
                }
            }
        }.start();
    }
}
