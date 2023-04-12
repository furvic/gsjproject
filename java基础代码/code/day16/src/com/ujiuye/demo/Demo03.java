package com.ujiuye.demo;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("sf");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);

        list.removeAll(list1);

        //list.addAll(list1);
        ArrayList<Object> list2 = new ArrayList<>();
        list2.addAll(list1);

    }
}
