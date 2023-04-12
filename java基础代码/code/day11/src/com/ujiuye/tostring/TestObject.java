package com.ujiuye.tostring;

public class TestObject {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
        System.out.println(p.equals(p1));
        Animal a = new Animal("小花",3);
        Animal a1 = new Animal("小花",3);
        System.out.println(a.equals(a1));
    }

}
