package com.ujiuye.Demo;

public class Demo_静态代码块 {
    int i = 2;
    static int j = 3;
    static{
        j = 6;
        System.out.println("sjsjsjsjjsjs");

    }

    public static void main(String[] args) {
        System.out.println(Demo_静态代码块.j);
        Demo_静态代码块 d = new Demo_静态代码块();
        Demo_静态代码块 d1 = new Demo_静态代码块();
    }
}
