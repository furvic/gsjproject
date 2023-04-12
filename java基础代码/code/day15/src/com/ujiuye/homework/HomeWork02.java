package com.ujiuye.homework;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HomeWork02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ef");
        list.add("wr");
        list.add("34");
        list.add("def");
        list.add("def");
        list.add("def");
        list.add("hil");
        list.add("j");
        list.add("edf");
        list.add("gk");
        System.out.println(list);
        ListIterator lit = list.listIterator();
        while(lit.hasNext()){
            String s1 = (String)lit.next();
            if("def".equals(s1)){
                lit.remove();
            }
        }
        System.out.println(list);
        Iterator it = list.iterator();
        while(it.hasNext()){
            String ss = (String)it.next();
            System.out.println(ss);
        }



    }
}
