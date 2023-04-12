package com.ujiuye.test;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<Student>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getName().equals(o2.getName()) && o1.getAge() == o2.getAge() ? 0 : 1;
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
        for (Student s : set){
            System.out.println(s);
        }

        Object[] obj = set.toArray();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < obj.length; i++){
            Student s = (Student) obj[i];
            String name = s.getName();
            String xing = name.substring(0,1);
            list.add(xing);
        }
        System.out.println(list);
        Map<String,Integer> map = new HashMap<>();
        for(String ss : list){
            if(map.containsKey(ss)){
                map.put(ss,map.get(ss) + 1);
            }else{
                map.put(ss,1);
            }
        }
        System.out.println(map);
        Set<String> set1 = map.keySet();
        for(String value : set1){
            Integer i = map.get(value);
            System.out.println(value +" ----"+ i);
        }

    }
}
