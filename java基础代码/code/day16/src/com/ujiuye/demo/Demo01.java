package com.ujiuye.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("sd");
        list.add("df");
        list.add("dsfgop");
        for(String s : list){
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
        //ArrayList<Integer> list1 = new ArrayList<Object>();
        ArrayList<Character> list2 = new ArrayList<>();
    }


}
