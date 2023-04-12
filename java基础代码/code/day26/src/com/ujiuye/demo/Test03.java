package com.ujiuye.demo;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(288);
        list.add(57);
        list.add(113);
        list.add(16);
        list.add(99);
        Predicate<Integer> pre = x -> x % 2 == 0;
        System.out.println(testPre(list,pre));
        Predicate<Integer> pre1 = x -> x <= 100;
        System.out.println(testPre(list,pre1));

        System.out.println(testPre(list,pre.and(pre1)));

        System.out.println(testPre(list,pre.or(pre1)));

        Predicate<Integer> pre2 = x -> x <= 100 && x % 2 != 0;
        System.out.println(testPre(list,pre2));

        Predicate<Integer> pre3 = x -> x <= 100 || x % 2 == 0;
        System.out.println(testPre(list,pre3));


    }

    public static ArrayList<Integer> testPre(ArrayList<Integer> list , Predicate<Integer> pre){
        ArrayList<Integer> target = new ArrayList<>();
        for(Integer i : list){
            if(pre.test(i)){
                target.add(i);
            }
        }
        return target;

    }

}
