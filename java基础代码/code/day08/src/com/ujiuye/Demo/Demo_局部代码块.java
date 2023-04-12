package com.ujiuye.Demo;

public class Demo_局部代码块 {
    public static void main(String[] args) {
        int i = 10;
        {
            int y = 23;
            System.out.println(y);
            i = 99;

        }
        System.out.println(i);
    }
}
