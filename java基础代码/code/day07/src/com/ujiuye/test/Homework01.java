package com.ujiuye.test;

public class Homework01 {
    String name;
    String color;
    public Homework01(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eat() {
        String name = "猫";
        System.out.println(name+"在吃...");
        System.out.println(this.name + "在吃饭");
    }

    public void sleep() {
        System.out.println(name + "在睡觉");

    }

    public static void main(String[] args) {
        Homework01 a1 = new Homework01("小狗", "白色");
        Homework01 a2 = new Homework01("小马", "棕色");
        a1.sleep();
        a2.eat();
    }
}
