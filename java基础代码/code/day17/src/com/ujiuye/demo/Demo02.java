package com.ujiuye.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"32");
        map.put(43,"sg");
        map.put(23,"hgs");
        map.put(5,"hgs");
        System.out.println(map);

        Set<Integer> set = map.keySet();
        for(Integer in : set){
            String s = map.get(in);
            System.out.println(in +" ---------"+s);
        }
    }
}
