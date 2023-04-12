package com.ujiuye.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String str = "abcdsscchdyti12";
        if (str.isEmpty()) {
            System.out.println("错");
        } else {
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < str.length(); i++){
                Character cha = str.charAt(i);
                if(map.containsKey(cha)){
                    map.put(cha,map.get(cha) + 1);
                }else{
                    map.put(cha,1);
                }
            }
            System.out.println(map);
            Set<Character> set = map.keySet();
            for(Character ch : set){
                Integer in = map.get(ch);
                System.out.println( ch + " ---- " + in);
            }

        }

    }
}
