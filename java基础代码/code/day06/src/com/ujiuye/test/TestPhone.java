package com.ujiuye.test;

public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "华为";
        p.price = 999.99;
        p.look();
        Phone p1 = new Phone();
        p1.brand = "小米";
        p1.price = 499.99;
        p1.look();
        Phone p2 = new Phone();
        p2.brand = "格力";
        p2.price = 399.99;
        p2.look();
    }
}
