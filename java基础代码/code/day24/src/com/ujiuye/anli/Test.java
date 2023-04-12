package com.ujiuye.anli;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("gfs");
        list.add("nmv");
        list.add("ryjj");
        Class c = list.getClass();
        Method m = c.getMethod("add",Object.class);
        m.invoke(list,23);
        m.invoke(list,43);
        m.invoke(list,43);
        System.out.println(list);




    }
}
