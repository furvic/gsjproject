package com.ujiuye.demo;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "狗狗";
        a.color = "黄色";
        a.say();
        a.setAge(2);
        System.out.println("它今年"+a.getAge()+"岁了。");
    }

}
