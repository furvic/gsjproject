package com.ujiuye.Demo;

public class Dog extends Animal{
    String name;
    String color;
    int age;

    public void lookHome(){
        System.out.println(super.name+"狗狗可以看家" + super.color);
    }
    @Override
    public void fun(){
        System.out.println("嘿嘿嘿哈哈哈红红火火恍恍惚惚红红火火恍恍惚惚");
    }
}
