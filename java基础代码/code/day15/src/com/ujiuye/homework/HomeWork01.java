package com.ujiuye.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list);
        list.add(2,"2ADD");
        System.out.println(list);
        String s = (String)list.get(5);
        System.out.println(s);
        list.remove(6);
        list.set(7,"7Modify");
        System.out.println(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            String ss = (String)it.next();
            System.out.println(ss);
        }

    }
}
