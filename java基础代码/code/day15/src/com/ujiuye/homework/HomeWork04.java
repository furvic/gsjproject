package com.ujiuye.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class HomeWork04 {
    public static void main(String[] args) {
        Date d1 = new Date();
        List list = null;
        for (int i = 1; i < 1000000; i++) {
            list = new ArrayList();
            list.add("ahd");
            list.add("dsfh");
            list.add("32");
            list.add("438");
            //System.out.println(list);
            list.remove(3);
        }
        //System.out.println(list);
        Date d2 = new Date();
        System.out.println(d2.getTime() - d1.getTime());
        Date d3 = new Date();
        LinkedList list1 = null;
        for (int i = 1; i < 1000000; i++) {
            list1 = new LinkedList();
            list1.addFirst("sdg");
            list1.add("sgd");
            list1.add("245");
            list1.addLast("54");
            //System.out.println(list1);
            list1.remove(3);
        }
        //System.out.println(list1);
        Date d4 = new Date();
        System.out.println(d2.getTime() - d1.getTime());
        long time1 = d1.getTime() - d2.getTime();
        long time2 = d3.getTime() - d4.getTime();
        if((time1 - time2) < 0){
            System.out.println("ArrayList的增删所用的时间比LinkedList的短，故ArrayList的效率高");
        }else{
            System.out.println("ArrayList的增删所用的时间比LinkedList的长，故LinkedList的效率高");
        }
        Date d5 = new Date();
        String s = null;
        for (int i = 1; i < 500000; i++) {
            s = (String)list.get(2);
        }
        //System.out.println(s);
        Date d6 = new Date();
        Date d7 = new Date();
        String s1 = null;
        for (int i = 1; i < 500000; i++) {
            s1 = (String)list1.get(2);
        }
        //System.out.println(s1);
        Date d8 = new Date();
        long time3 = d5.getTime() - d6.getTime();
        long time4 = d7.getTime() - d8.getTime();
        if((time3 - time4) < 0){
            System.out.println("ArrayList的所查询用的时间比LinkedList的短，故ArrayList的效率高");
        }else{
            System.out.println("ArrayList的查询所用的时间比LinkedList的长，故LinkedList的效率高");
        }
    }
}
