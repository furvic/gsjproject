package com.ujiuye.Demo;

public class Demo_构造代码块 {
    String name;
    int age;
    {
        name = "很好";
        age = 23 ;
        System.out.println("*****************");
    }
    public Demo_构造代码块(){
        System.out.println("______---------------");
    }
    public Demo_构造代码块(String name) {
        this.name = name;

    }
    public Demo_构造代码块(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Demo_构造代码块 d = new Demo_构造代码块();
        System.out.println(d.name);
    }
}
