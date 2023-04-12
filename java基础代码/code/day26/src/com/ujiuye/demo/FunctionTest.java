package com.ujiuye.demo;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> fun = x -> 2 * x;
        System.out.println(testFunction(3,fun));

        Function<Integer,Integer> fun1 = x -> x;
        System.out.println(testFunction(3,fun1));

        Function<Integer,Integer> fun2 = x -> x * x;
        System.out.println(testFunction(3,fun2));
    }

    public static int testFunction(int x , Function<Integer,Integer> fun){
        return fun.apply(x);
    }
}
