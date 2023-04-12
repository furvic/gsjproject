package com.ujiuye.demo;

import java.math.BigDecimal;

public class Demo03 {
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("3.14");
        System.out.println(b);
        BigDecimal b1 = new BigDecimal(3.15);
        System.out.println(b1);
        System.out.println(b.add(b1));
        System.out.println(b.subtract(b1));
        System.out.println(b.multiply(b1));
        BigDecimal b2 = new BigDecimal("9.9");
        BigDecimal b3 = new BigDecimal("3");
        System.out.println(b2.divide(b3));
        System.out.println(b2.divide(b3,2,BigDecimal.ROUND_HALF_UP));
    }
}
