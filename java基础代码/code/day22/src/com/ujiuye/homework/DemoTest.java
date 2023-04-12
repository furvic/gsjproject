package com.ujiuye.homework;

public class DemoTest {
    public static void main(String[] args) {
        Test1 t = new Test1();
        Thread th1 = new Thread(t,"1");
        Thread th2 = new Thread(t,"2");
        th1.start();
        th2.start();
    }
}
