package com.ujiuye.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("张三",32));
        set.add(new Student("王五",23));
        set.add(new Student("昭苏",12));
        set.add(new Student("前柳",34));
        set.add(new Student("六柳",12));
        set.add(new Student("王五",23));
        System.out.println(set);
        System.out.println("------------------------");
        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }
    }
}
