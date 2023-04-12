package com.ujiuye.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo03 {
    public static void main(String[] args) {
        String[] ss = {"火锅","烧烤","炸酱面","水煮鱼","烧鸡","酱牛肉","状馍","粽子","担担面","猪下水","毛肚"};
        Stream<String> str = Stream.of(ss).filter(x -> x.length() == 2);
        /*Object[] obj = str.toArray();
        for(Object o : obj){
            System.out.println(o);
        }*/

        List<Object> list = str.collect(Collectors.toList());
        System.out.println(list);

        Set<Object> set = str.collect(Collectors.toSet());
        System.out.println(set);
    }
}
