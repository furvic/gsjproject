package com.ujiuye.demo;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Random ran = new Random();
        Set<Integer> set = new HashSet<>();
        while(set.size() < 5){
            int in = ran.nextInt(99) + 1;
            set.add(in);
        }
        System.out.println(set);
    }
}
