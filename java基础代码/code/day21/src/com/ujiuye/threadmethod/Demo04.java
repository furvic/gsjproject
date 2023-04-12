package com.ujiuye.threadmethod;

public class Demo04 {
    public static void main(String[] args) {
        Thread t0 = new Thread("线程A"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t0.setPriority(Thread.MAX_PRIORITY);
        t0.yield();
        t0.start();
        Thread t1 = new Thread("线程B"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        for(int i = 1; i <= 5; i++){
            System.out.println( "main---" + i);
        }
    }
}
