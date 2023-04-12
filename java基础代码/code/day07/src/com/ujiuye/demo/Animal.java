package com.ujiuye.demo;

public class Animal {
    String name;
    String color;
    private int age;
    public void setAge(int age){

        if (age < 0 || age > 100) {
            System.out.println("年龄不能小于0，也不能超过一百");
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public void say(){
        System.out.println("这是一条好" + name +"它的颜色是" + color +"色");

    }
}
