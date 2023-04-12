package com.ujiuye.homework;

public class LuckTest {
    public static void main(String[] args) {
        Luck lu = new Luck();
        Thread th = new Thread(lu,"抽奖箱1");
        Thread th1 = new Thread(lu,"抽奖箱2");
        th.start();
        th1.start();
    }
}
