package com.ujiuye.demo;

public class Demo03 {
    public static void main(String[] args) {
        int i;
        try {
            i = 10 / 0;
        }catch (ArithmeticException e){
            i = 88;
            System.out.println("我是try-catch语句，我捕获住了异常");
        }
        System.out.println("end");
    }
}
