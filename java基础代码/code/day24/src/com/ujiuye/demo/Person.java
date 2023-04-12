package com.ujiuye.demo;

public class Person {
    private String name;
    public int age;


    public Person() {
    }

   private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void show(){
        System.out.println("吼吼吼吼吼吼吼吼吼");
    }
    public void sun(){
        System.out.println("哈哈啊哈哈哈哈哈");
    }
}
