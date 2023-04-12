package com.ujiuye.set;

import java.util.HashSet;

public class Demo03 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("张三",23));
        set.add(new Person("张三",23));
        set.add(new Person("两束",23));
        System.out.println(set);
    }
}
