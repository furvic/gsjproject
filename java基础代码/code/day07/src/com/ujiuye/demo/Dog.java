package com.ujiuye.demo;

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(){
        name = "大黄";
        color = "黄色";
        age = 3;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
