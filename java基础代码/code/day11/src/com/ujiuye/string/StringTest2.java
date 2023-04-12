package com.ujiuye.string;

public class StringTest2 {
    public static void main(String[] args) {
        System.out.println("--------------长度---------------------");
        String s = "adfghah315436kdgbske";
        int l = s.length();
        System.out.println(l);
        System.out.println("--------------获取指定索引的字符---------------------");
        char cha = s.charAt(3);
        System.out.println(cha);
        System.out.println("--------------截取从开始指定位置的索引的字符串---------------------");
        String sub = s.substring(2);
        System.out.println(sub);
        System.out.println("--------------截取从开始指定位置的索引到结束指定位置的索引的字符串--------------------");
        String sub1 = s.substring(2,6);
        System.out.println(sub1);
        System.out.println("--------------获取指定字符串第一次出现的索引位置---------------------");
        int in = s.indexOf("h");
        System.out.println(in);
        System.out.println("--------------获取从指定索引位置找第一次出现的指定字符---------------------");
        int in1 = s.indexOf('f',2);
        System.out.println(in1);
        System.out.println("--------------获取从后往前的指定索引位置找第一次出现的指定字符------------");
        int last = s.lastIndexOf('h');
        System.out.println(last);


    }
}
