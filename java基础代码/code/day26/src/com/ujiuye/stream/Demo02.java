package com.ujiuye.stream;

import java.lang.ref.SoftReference;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        String[] ss = {"火锅","烧烤","炸酱面","水煮鱼","烧鸡","酱牛肉","状馍","粽子","担担面","猪下水","毛肚"};
        Stream<String> str1 = Stream.of(ss);
        //str1.filter(x -> x.length() == 2).forEach(x -> System.out.println(x));
        //x -> x.length() == 代表Predicate p 断言式函数接口
        //x -> System.out.println(x)代表的是Consumers con 消费式函数接口
        Stream<String> str2 = str1.filter(x -> x.length() == 2);
        Stream<String> str3 = str2.limit(3);
        //str3.forEach(x -> System.out.println(x));
        Stream<String> str4 = str3.skip(1);
        //str4.forEach(x -> System.out.println(x));
        Stream<byte[]> str5 = str4.map(x -> x.getBytes());
        //str5.forEach(x -> System.out.println(x));

        String[] ss1 = {"火锅","烧烤","炸酱面",};
        String[] ss2 = {"烤鸭","寿司","拉面面",};
        Stream<String> str6 = Stream.concat(Stream.of(ss1),Stream.of(ss2));
        str6.forEach(System.out::println);

    }
}
