package com.ujiuye.homework;

public class HomeWork02 {
    public static void main(String[] args) {
        String age = "23,24,25";
        String[] str = age.split(",");
        int sum = 0;
        for(int i = 0; i < str.length; i ++){
            int a = Integer.parseInt(str[i]);
            sum = sum + a;
        }
        int ave = sum / str.length;
        System.out.println(ave);
        String name = "张三@李四@王五@矛盾";
        String name1 = name.replace("@","  ");
        System.out.println(name1);
    }
}
