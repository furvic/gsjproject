package com.ujiuye.demo;



import java.util.HashMap;

public class Demo04 {
    public static void main(String[] args) {
        HashMap<Person,String> hash = new HashMap<>();
        hash.put(new Person("张三",23),"xg");
        hash.put(new Person("张三",23),"xjp");
        System.out.println(hash);
    }
}
