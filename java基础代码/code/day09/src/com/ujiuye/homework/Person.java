package com.ujiuye.homework;

import com.sun.deploy.security.JarAsBLOBVerifier;

public class Person {
    private int age;
    private String name;
    public void keepPet(Animal a, String something){
        a.eat(something);
        System.out.println(age + "岁的" + name + "养了一只" +a.getAge() + " 岁的" + a.getColor() + "色的宠物。" );
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
