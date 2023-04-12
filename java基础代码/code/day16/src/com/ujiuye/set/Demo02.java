package com.ujiuye.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo02 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        int num = o1.getAge() - o2.getAge();
                        return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                    }
                }
        );
        set.add(new Student("张三",32));
        set.add(new Student("王五",23));
        set.add(new Student("昭苏",12));
        set.add(new Student("前柳",34));
        set.add(new Student("六柳",12));
        set.add(new Student("王五",23));
        System.out.println(set);

    }

}
