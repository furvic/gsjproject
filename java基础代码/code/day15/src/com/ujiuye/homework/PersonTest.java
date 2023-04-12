package com.ujiuye.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Person("张三",23,"男","河南"));
        list.add(new Person("李四",45,"男","河南"));
        list.add(new Person("王五",34,"女","山西"));
        list.add(new Person("赵六",22,"男","上海"));
        list.add(new Person("田七",33,"女","北京"));
        /*for(Object obj : list){
            Person p = (Person)obj;
            System.out.println(p);
        }*/
        Iterator it = list.iterator();
        while(it.hasNext()){
            Person p = (Person)it.next();
            System.out.println(p);
        }
        System.out.println("----------------------------");
        list.add(2,new Person("zhao6",24,"女","广州"));
        list.remove(3);
        System.out.println(list);
    }
}
