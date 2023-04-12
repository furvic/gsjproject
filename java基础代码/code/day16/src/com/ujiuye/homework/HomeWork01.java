package com.ujiuye.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HomeWork01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        for(int i = 0; i < strs.length; i++){
            set.add(strs[i]);
        }
        System.out.println(set);
        System.out.println("------------------------------");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("------------------------------");

    }
}
