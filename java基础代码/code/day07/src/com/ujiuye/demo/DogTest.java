package com.ujiuye.demo;

public class DogTest {
    public static void main(String[] args) {
        Dog g =new Dog();
        System.out.println(g.getName()+g.getColor()+g.getAge());
        Dog g1 = new Dog("毛毛",3);
        System.out.println(g1.getName()+g1.getAge());
    }
}
