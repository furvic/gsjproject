package com.ujiuye.demo;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnble my = new MyRunnble();
        Thread th = new Thread(my);
        th.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<= 10; i++){
                    System.out.println("匿名runnable----" + i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        new Thread(
                new Runnable(){
                    @Override
                    public void run() {
                        for(int i = 1; i <= 10; i++){
                            System.out.println("匿名runnable22---" + i);
                        }
                    }
                }
        ).start();



        /*new Thread(
                new Runnable(){
                    @Override
                    public void run() {
                        for(int i = 1; i <= 10; i++){
                            System.out.println("匿名runnable22---" + i);
                        }
                    }
                }).start();*/

        for(int i = 1; i <= 10; i++){
            System.out.println("main----" + i);
        }
    }
}
