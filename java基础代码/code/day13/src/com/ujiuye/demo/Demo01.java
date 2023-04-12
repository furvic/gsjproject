package com.ujiuye.demo;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(123);
        System.err.println(123);
        long time = System.currentTimeMillis();
        System.out.println(time);
        for(int i = 1; i <= 10000000; i++ ){
            i += 3;
        }
        System.exit(0);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - time);


    }
}
