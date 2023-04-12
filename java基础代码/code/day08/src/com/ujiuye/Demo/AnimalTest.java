package com.ujiuye.Demo;

public class AnimalTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "maoni";
        c.eat();
        c.catchMouse();;
        Dog g = new Dog();
        g.eat();
        g.lookHome();
        Animal a = new Cat();
        g.name = "小黑";
        g.eat();
        g.lookHome();
        c.fun();
        g.fun();


    }
}
