package com.ujiuye.stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("fs");
        list.add("24");
        list.add("只能够");
        Stream<String> str = list.stream();
        System.out.println(str.count());

        Set<Integer> set = new HashSet<>();
        Stream<Integer> str1 = set.stream();
        System.out.println(str1.count());

        String[] s = {"花花","红红"};
        Stream<String> str2 = Stream.of(s);
        System.out.println(str2.count());


    }
}
