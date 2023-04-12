package com.ujiuye.demo;

public class Demo01 {
    public static void main(String[] args) {
        String s = "dfhdsgFSKdjsSDDSkfsl";
        System.out.println("--------将字符串转为字符数组------------------");
        char[] ch = s.toCharArray();
        System.out.println(ch);
        System.out.println("--------将字符串转为字节数组------------------");
        byte[] b = s.getBytes();
        for(int i =0 ; i < b.length; i++){
            System.out.print(b[i] + "  ");
        }
        System.out.println(b);
        System.out.println("--------将字符串转为大写------------------");
        String s1 = s.toUpperCase();
        System.out.println(s1);
        System.out.println("--------将字符串转为小写------------------");
        String s2 = s.toLowerCase();
        System.out.println(s2);
        System.out.println("--------将字符数组转为字符串------------------");
        String st = String.valueOf(ch);
        System.out.println(st);
        System.out.println("--------将整数类型转为字符串------------------");
        String str = String.valueOf(25);
        System.out.println(str + 15);
        System.out.println("--------将整数数组转为字符串------------------");
        int[] u = {1,35,78,978,34,56};
        String ss = String.valueOf(u);
        System.out.println(ss);
    }
}
