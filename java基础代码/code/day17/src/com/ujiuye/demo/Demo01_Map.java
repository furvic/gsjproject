package com.ujiuye.demo;
import java.util.HashMap;
import java.util.Map;

public class Demo01_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"sdf");
        map.put(2,"345");
        map.put(3,"ishg");
        System.out.println(map);
        map.put(2,"zhogng");
        System.out.println(map);
        String ss = map.remove(1);
        System.out.println(ss);
        boolean bo = map.containsKey(2);
        System.out.println(bo);
        System.out.println(map.size());
        String s = map.get(3);
        System.out.println(s);
        map.clear();
        System.out.println(map.isEmpty());
    }
}
