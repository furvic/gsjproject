package com.ujiuye.homework;

public class HomeWork02 {
    public static void main(String[] args) {

        IntCalc i = (a,b) -> {
            int area = 0;
            if(a != 0 && b != 0){
                area = a * b;
                System.out.println(area);
            }else {
                System.out.println("a 和 b 不能为零.");
            }
            return area;
        };
        get(34,5,i);
    }
    public static void get(int a, int b, IntCalc c){
        c.calt(a,b);
    }
}

@FunctionalInterface
interface IntCalc{
    int calt(int a , int b);
}