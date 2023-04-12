package com.ujiuye.threadmethod;

public class Demo06 {
    public static void main(String[] args) {
        Thread t0 = new Thread("守护线程"){
            @Override
            public void run(){
                int i =1;
                while (true){
                    System.out.println(getName() + "---" + i);
                    i++;
                }
            }
        };
        t0.setDaemon(true);
        t0.start();
        Thread t1 = new Thread("非守护线程"){
            @Override
            public void run(){
                for(int i = 1; i <= 5; i++){
                    System.out.println(getName() + "---" + i);
                }
            }
        };
        t1.start();
    }
}
