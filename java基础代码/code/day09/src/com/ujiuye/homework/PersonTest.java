package com.ujiuye.homework;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        Animal a = new Cat();
        p.setAge(38);
        p.setName("老王");
        a.setColor("黄");
        a.setAge(3);
        Cat c = (Cat) a;
        c.catchMouse();
        p.keepPet(a,"小鱼干");
        Animal a1 = new Dog();
        p.setName("老李");
        p.setAge(32);
        a1.setAge(3);
        a1.setColor("白");
        Dog g = (Dog) a1;
        g.lookHome();
        p.keepPet(a1,"大骨头");
    }
}
