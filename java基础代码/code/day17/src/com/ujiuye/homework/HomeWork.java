package com.ujiuye.homework;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return (o1.getName().equals(o2.getName())) && o1.getAge() - o2.getAge() == 0 ? 0 : 1;
                    }
                }
        );
        set.add(new Student("张三",20));
        set.add(new Student("李四",20));
        set.add(new Student("王五",19));
        set.add(new Student("李刘",18));
        set.add(new Student("王萌萌",20));
        set.add(new Student("李四",20));
        System.out.println(set);
        for(Student s : set){
            System.out.println(s);
        }
        Object[] s1 = set.toArray();
        ArrayList<Student> list = new ArrayList<>();
        for(int i = 0; i < s1.length; i++){
            Student str = (Student) s1[i];
            list.add(str);
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            Student s = list.get(i);
            String xing = s.getName().substring(0,1);
            if(map.containsKey(xing)){
                map.put(xing,map.get(xing) + 1);
            }else{
                map.put(xing,1);
            }
        }//添加元素
        Set<String> set1 = map.keySet();//遍历元素
        for(String ss : set1){
            Integer in = map.get(ss);
            System.out.println(ss + "--------" + in);
        }

    }
}
