package com.ujiuye.demo;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        File f = new File("E:\\工具\\Java1.28\\笔记");
        if (f.isDirectory()) {
            String name = f.getName();
            System.out.println(name);
            File[] list = f.listFiles();
            Map<String,Integer> map = new HashMap<>();
            System.out.println(Arrays.toString(list));
            for(File file : list){
                String n = file.getName();
                String[] ss = n.split("\\.");
                String end = ss[ss.length - 1];
                if(map.containsKey(end)){
                    map.put(end,map.get(end) + 1);
                }else{
                    map.put(end,1);
                }
            }
            System.out.println(map);
            Set<Map.Entry<String,Integer>> set = map.entrySet();
            for(Map.Entry<String,Integer> entry : set){
                String value = entry.getKey();
                Integer key = entry.getValue();
                System.out.println(value +"-----------"+ key);
            }
        } else {
            System.out.println("不是文件夹，没法操作");
        }

    }
}
