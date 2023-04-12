package com.ujiuye.duotaiTest;

public class SuperMan extends Person{
    @Override
    public void dealBui(){
        System.out.println(super.getName() + "不止会谈生意");
    }
    public void fly(){
        System.out.println("我还会飞");
    }
}
