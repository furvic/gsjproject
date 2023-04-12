package com.ujiuye.threadmethod;

public class Demo05 {
    public static void main(String[] args) {
        Thread t = new Thread("打断线程"){
            @Override
            public void run(){
                for(int i = 1; i<= 10; i++){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() +"------"+ i);
                }
            }
        };
        t.start();
        t.interrupt();
    }
}
