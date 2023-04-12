package com.ujiuye.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"32");
        map.put(43,"sg");
        map.put(23,"hgs");
        map.put(5,"fys");
        System.out.println(map);

        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        for(Map.Entry<Integer,String> m: entry){
            int i = m.getKey();
            String s = m.getValue();
            System.out.println(i +"-----------"+ s);
        }
    }
}
