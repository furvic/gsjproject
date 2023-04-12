package com.ujiuye.demo;

import java.util.*;

public class Demo05 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(1,"dshf");
        hash.put(44,"45");
        hash.put(22,"eri");
        System.out.println(hash);

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"dshf");
        map.put(44,"45");
        map.put(22,"eri");
        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(34);
        set.add(6);
        set.add(12);
        System.out.println(set);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(2);
        set1.add(34);
        set1.add(6);
        set1.add(12);
        System.out.println(set1);


    }
}
