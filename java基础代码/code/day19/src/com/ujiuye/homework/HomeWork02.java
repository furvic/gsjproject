package com.ujiuye.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("dghusd");
        list.add("adhf");
        list.add("dzf346xgbfds");
        list.add("sdg3rfxg35");
        list.add("sdygisgsi");
        for(int j = 0; j < list.size() ;j++){
            String ss = list.get(j);
            for(int i = 0; i < ss.length(); i++){
                if(ss.charAt(i) >= '0' && ss.charAt(i) <= '9'){
                    list.remove(ss);
                    j--;
                }
            }
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
