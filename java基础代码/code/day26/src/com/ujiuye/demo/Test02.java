package com.ujiuye.demo;

import java.util.function.Function;

public class Test02 {
    public static void main(String[] args) {
        Function<String,Integer> fun = x -> Integer.parseInt(x);
        Function<Integer,Integer> fun1 = x -> 2 * x;
        System.out.println(testFun1("6",fun,fun1));

        Function<Integer,Integer> fun2 = x -> x + 1;
        System.out.println(testFun1("-1",fun,fun2));
    }

    public static int testFun(String x , Function<String, Integer> fun){
        return fun.apply(x);
    }
    public static int testFun1(String x, Function<String,Integer> fun ,Function<Integer,Integer> fun2){
        return fun.andThen(fun2).apply(x);
        //return fun2.apply(fun.apply(x));
    }
}
