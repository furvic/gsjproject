package com.ujiuye.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class HomeWork02 {
    public static void main(String[] args) throws Exception{
        Class c = Calculator.class;
        Method m = c.getDeclaredMethod("add",Object.class,Object.class);
        System.out.println(m);
        Constructor con = c.getDeclaredConstructor();
        System.out.println(con);
        Object obj = con.newInstance();
        System.out.println(obj);
        m.invoke(obj,5.564,4.356);
       //System.out.println(m);
    }
}
