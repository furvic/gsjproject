package com.ujiye.demo01;

public class TestMyinterface {
    public static void main(String[] args) {
        System.out.println(Myinterface.I);
        MyClass m = new MyClass();
        m.setName("二丫");
        m.setAge(34);
        m.eat();
        m.fleed();
        System.out.println("*********************************");
        MyIntefaceImpl2 my = new MyInterfaceImpl3();
        my.fleed();
        System.out.println("*********************************");
        MyInterfaceImpl3 my2 = (MyInterfaceImpl3) my;
        my2.sing();
        my2.see();
        System.out.println("*********************************");
        m.sing();
        m.ying();

    }
}
