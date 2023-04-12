package com.ujiuye.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(762);
        list.add(6);
        list.add(17);
        list.add(6);
        list.add(6);

        Collections.sort(list);

        System.out.println(list);
        Integer max = Collections.max(list);
        System.out.println(max);
        Integer min = Collections.min(list);
        System.out.println(min);

        Collections.replaceAll(list,6,333);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);


    }
}
