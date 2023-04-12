package com.ujiye.demo01;

public class MyClass extends MyInterfaceImpl3 implements Myinterface{
    private String name;
    private int age;

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

    @Override
    public void eat() {
        System.out.println( name +"吃牛排" + age );
    }

    @Override
    public void fleed() {
        System.out.println("呵呵呵呵呵");
    }

    @Override
    public void fun() {
        System.out.println("超级好玩");
    }

    @Override
    public void sun() {
        System.out.println("我喜欢月亮");
    }

    @Override
    public void work() {
        System.out.println("工作买大house");
    }
    public void ying(){
        System.out.println("哼哼哼哼哼哼哼哼哼");
    }
}
