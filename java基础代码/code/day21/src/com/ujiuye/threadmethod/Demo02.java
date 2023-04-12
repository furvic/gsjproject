package com.ujiuye.threadmethod;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        new Thread("线程A"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                    }
                    System.out.println(getName() + "----" +i);
                }
            }
        }.start();



        for(int i = 1; i <= 5; i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "---" + i);

        }
    }
}
