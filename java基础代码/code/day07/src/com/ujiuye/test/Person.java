package com.ujiuye.test;

public class Person {
    private String name = "张三";
    private int age = 20;
    public Person(){
        System.out.println("构造执行了");
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.info();


        Person p2 = new Person();
        p2.name = "豆豆";
        p2.age = 19;
        p2.info();

        new Person();
    }

    private void info() {
        System.out.println(this.name + "今年" +this.age +"岁");
    }
}
