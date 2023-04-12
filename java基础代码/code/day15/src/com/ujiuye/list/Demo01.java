package com.ujiuye.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo01 {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add("a");
        li.add("b");
        li.add("c");
        li.add("d");
       /* System.out.println(li);
        li.remove("a");
        li.remove(1);
        System.out.println(li);
        Object o = li.set(1,"saidh");
        System.out.println(li);
        System.out.println(o);
        Object ob = li.get(1);
        System.out.println(ob);
        for(int index = 0; index < li.size(); index++){
            String s = (String)li.get(index);
            System.out.println(s);
        }*/
        System.out.println("------------------------------");
        function(li);
        function1(li);
    }
    public static void function(List list){
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            String s = (String) it.next();
            if("b".equals(s)){
                it.add("end");
            }
        }
        System.out.println(list);
    }
    public static void function1(List list){
        for(int i = 0; i < list.size(); i++){
            String s = (String) list.get(i);
            if("b".equals(s)){
                list.add("end");
            }
        }
        System.out.println(list);
    }
}
