package com.ujiuye.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("sfd");
        set.add("efg");
        set.add("hy");
        set.add("kohg");
        System.out.println(set);

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        for (String s: set) {
            System.out.println(s);
        }
    }
}
