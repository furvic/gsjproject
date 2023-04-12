package com.ujiuye.demo;

public class InterfaceClass extends Fu implements OtherMothod,Inter2{

    @Override
    public void run() {
        System.out.println("快跑呀嘤嘤嘤嘤嘤嘤嘤嘤嘤");
    }
    /*@Override
    public void eat() {
        Inter2.super.eat();
        System.out.println("dshfshgso");
    }*/
    @Override
    public void sleep() {
        System.out.println("熬夜了呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜呜");
    }
}
