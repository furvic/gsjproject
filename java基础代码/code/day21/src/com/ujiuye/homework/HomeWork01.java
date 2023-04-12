package com.ujiuye.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Bus b = new Bus();
        Thread t1 = new Thread(b,"前门");
        Thread t2 = new Thread(b,"中门");
        Thread t3 = new Thread(b,"后门");
        t1.start();
        t2.start();
        t3.start();
    }
}
