package com.ujiuye.homework;

public class Dog extends Animal{

    public void lookHome(){
        System.out.println( getAge() + "的狗狗还可以看家。它的毛毛是" + getColor());
    }
    @Override
    public void eat(String something) {
        System.out.println("狗狗啃" + something);
    }
}
