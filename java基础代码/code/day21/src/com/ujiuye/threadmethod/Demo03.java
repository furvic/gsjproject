package com.ujiuye.threadmethod;

public class Demo03 {
    public static void main(String[] args) {
        Thread t0 = new Thread("低优先级"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t0.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        Thread t1 = new Thread("高优先级"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread t2 = new Thread("普通优先级"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
    }
}
