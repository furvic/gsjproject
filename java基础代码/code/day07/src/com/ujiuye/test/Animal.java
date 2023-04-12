package com.ujiuye.test;

public class Animal {
    String name;
    int age;
    public Animal(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println( this.age +"岁的" + this.name +"爱吃草莓。");
    }
}
