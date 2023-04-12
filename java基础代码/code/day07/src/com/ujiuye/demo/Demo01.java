package com.ujiuye.demo;

public class Demo01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 13;
        p.name = "李子";
        p.eat();

        new Person().eat();
    }
}
