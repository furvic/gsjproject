package com.ujiuye.homework;

public abstract class Animal {
    private int age;
    private String color;

    public abstract void eat(String something);
    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
