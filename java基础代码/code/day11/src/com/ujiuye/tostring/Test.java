package com.ujiuye.tostring;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        String str = p.toString();
        System.out.println(p);
        System.out.println("********************************");
        System.out.println(str);
        System.out.println("********************************");
        Animal a = new Animal();
        a.setName("小花");
        a.setAge(3);
        String str1 = a.toString();
        System.out.println(str1);
    }
}
