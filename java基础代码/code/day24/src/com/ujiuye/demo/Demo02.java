package com.ujiuye.demo;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class c = Person.class;
        Method[] me = c.getMethods();
        System.out.println(Arrays.toString(me));
        Method[] me1 = c.getDeclaredMethods();
        System.out.println(Arrays.toString(me1));

        Method m = c.getMethod("setAge", int.class);
        System.out.println(m);

        Method show = c.getDeclaredMethod("show");
        System.out.println(show);

        Person p = (Person)c.newInstance();
        m.invoke(p,20);
        System.out.println(p.getAge());

        Method sun = c.getMethod("sun");
        sun.invoke(p);

    }
}
