package com.ujiuye.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        String s = "Hello12345World";
        String s1 = s.substring(0,1).toLowerCase();
        System.out.println(s1);
        String s2 = s.substring(10,11).toLowerCase();
        System.out.println(s2);
        String s3 = s.substring(1,5).toUpperCase();
        String s6 = s.substring(11).toUpperCase();
        String s4 = s.substring(5,10);
        String s5 = s4.replace("12345","*****");
        System.out.println(s1 + s3 + s5 + s2 + s6  );
    }
}
