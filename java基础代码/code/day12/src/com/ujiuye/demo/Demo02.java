package com.ujiuye.demo;

public class Demo02 {

    public static void main(String[] args) {
        String s = "i LOve You!";
        String s1 = String.valueOf(s.charAt(0)).toUpperCase();
        String s2 = s.substring(0,1).toUpperCase();
        String second = s.substring(1).toLowerCase();
        System.out.println(s1 + second);
        System.out.println(s2 + second);
    }
}
