package com.ujiuye.abstracttest;

public class Programmer extends Emplee{
    private double jiangjin ;

    public Programmer() {
        super();
    }
    @Override
    public void work() {
        System.out.println( getName() + "的工作是开发，工号是" + getId());
    }
}
