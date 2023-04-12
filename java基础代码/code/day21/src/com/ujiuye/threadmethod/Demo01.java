package com.ujiuye.threadmethod;

public class Demo01 {
    public static void main(String[] args) {
        Thread th = new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= 10; i++){
                    System.out.println(Thread.currentThread().getName() + "---" +i);
                }
            }
        };
        th.setName("线程A");
        th.start();

        new Thread("线程B"){
            @Override
            public void run(){
                for(int i = 1; i <= 10; i++){
                    System.out.println(getName() + "---" +i);
                }
            }
        }.start();

        Runnable run =  new Runnable() {
                    @Override
                    public void run() {
                        for(int i = 1; i <= 10; i++){
                            System.out.println( Thread.currentThread().getName()+"runnable---" +i);
                        }
                    }
                };
        Thread t = new Thread(run,"线程C");
        t.start();
        System.out.println(t.getName() +"************");
    }
}
