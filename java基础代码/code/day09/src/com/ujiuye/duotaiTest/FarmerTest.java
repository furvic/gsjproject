package com.ujiuye.duotaiTest;

public class FarmerTest {
    public static void main(String[] args) {
        Farmer f = new Farmer();
        Animal a = new Dog();
        f.feed(a);
        Cat c = new Cat();
        f.feed(c);
        Animal s = new Sheep();
        f.feed(s);
    }
}
