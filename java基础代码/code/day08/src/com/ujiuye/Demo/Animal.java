package com.ujiuye.Demo;

public class Animal {
    String name;
    String color;
    int age;

   /* public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }*/

    public void eat(){
        System.out.println("动物可以吃饭");
        sleep();
    }
    private void sleep(){

        System.out.println("睡觉");
    }
    void fun(){

        System.out.println("啊哈哈哈哈哈啊");
    }
}
