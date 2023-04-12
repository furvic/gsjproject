package com.ujiye.demo01;

public class MyInterfaceImpl3 extends MyIntefaceImpl2 implements MyInterface2,Myinterface{

    @Override
    public void eat() {
        System.out.println("hhhhhhhhhhhhhh");
    }

    @Override
    public void fleed() {
        System.out.println("灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌灌");
    }

    @Override
    public void fun() {
        System.out.println("黑恶黑阿阿嘿诶额和阿");
    }

    @Override
    public void sun() {
        System.out.println("eheheehheheheh");
    }

    @Override
    public void work() {
        System.out.println("啊哈哈哈哈哈哈哈哈");
    }
    public void sing(){
        sun();
        work();
        fun();
        eat();
    }
}
