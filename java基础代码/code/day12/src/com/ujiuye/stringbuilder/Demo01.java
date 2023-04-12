package com.ujiuye.stringbuilder;


public class Demo01 {
    public static void main(String[] args) {
        System.out.println("------------获取字符串的容量------------------");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println("------------获取扩容字符串的容量------------------");
        StringBuilder sb1 = new StringBuilder(45);
        System.out.println(sb1.capacity());
        System.out.println("------------获取指定字符串的容量------------------");
        StringBuilder sb2 = new StringBuilder("dshf");
        System.out.println(sb2.capacity());
        System.out.println("------------获取字符串的长度------------------");
        System.out.println(sb2.length());
        System.out.println("------------添加字符串------------------");
        sb.append("as");
        System.out.println(sb);
        System.out.println("------------添加指定位置的字符串------------------");
        sb2.append("ok", 0, 2);
        System.out.println(sb2);
        System.out.println("------------指定位置添加字符数组------------------");
        char[] ch = {'w','4','g','h','q'};
        sb2.insert(2,ch);
        System.out.println(sb2);
        System.out.println("------------翻转字符串------------------");
        sb2.reverse();
        System.out.println(sb2);

        StringBuilder s = new StringBuilder(" sdg sdughs dfhds ");
        System.out.println(s);
        System.out.println("------------在字符串的末尾添加字符串------------------");
        sb2.insert(sb2.length(),"我是最棒的");
        System.out.println(sb2);
        System.out.println("------------串删除指定位置的字符串------------------");
        sb2.delete(2,6);
        System.out.println(sb2);
        System.out.println("------------获取指定位置的单个字符------------------");
        char ss = sb2.charAt(4);
        System.out.println(ss);
        System.out.println("------------删除指定位置的单个字符------------------");
        sb2.deleteCharAt(4);
        System.out.println(sb2);
        System.out.println("------------替换指定位置的单个字符------------------");
        sb2.replace(2,6,"---");
        System.out.println(sb2);
    }
}
