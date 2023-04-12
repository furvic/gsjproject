package com.ujiuye.demo;

public class Demo03 {
    public static void main(String[] args) {
        String s = "dahdskdfjskflssksetrecdff";
        System.out.println("--------------------替换字符串中的某个字符的所有============");
        String sNew = s.replace("s","&");
        System.out.println(sNew);
        System.out.println("--------------------切割字符串成字符串数组============");
        String[] sl = s.split("k");
        for (int i = 0; i < sl.length; i++){
            System.out.print(sl[i] + "\t");
        }
        System.out.println();
        System.out.println("--------------------切割指定范围的字符串成字符串数组============");
        String[] s2 = s.split("s",6);
        for (int i = 0; i < sl.length; i++){
            System.out.print(s2[i] + "\t");
        }
        System.out.println();
        System.out.println(s2);
        System.out.println("--------------------去除字符串前后的空格位============");
        s = "  dahds dasgjfj fgldh   ";
        String s1 = s.trim();
        System.out.println(s1);
    }
}
