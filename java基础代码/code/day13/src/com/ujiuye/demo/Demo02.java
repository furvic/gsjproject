package com.ujiuye.demo;

import java.math.BigInteger;

public class Demo02 {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("-246598042183986504325694314657685453423");
        System.out.println(b);
        BigInteger b1 = new BigInteger("234",8);
        System.out.println(b1);
        BigInteger b3 = b.abs();
        System.out.println(b);
        BigInteger b2 = new BigInteger("100");
        BigInteger b4 = b.negate();
        BigInteger b5 = new BigInteger("200");
        System.out.println(b2.add(b5));
        System.out.println(b2.subtract(b5));
        System.out.println(b2.multiply(b5));
        System.out.println(b2.divide(b5));
    }
}
