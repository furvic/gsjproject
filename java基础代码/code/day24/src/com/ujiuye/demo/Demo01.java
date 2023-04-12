package com.ujiuye.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        Class c = Person.class;//获取类
        System.out.println(c);
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);
        System.out.println(c == c1);
        Class c2 = Class.forName("com.ujiuye.demo.Person");
        System.out.println(c2);
        System.out.println(c1 == c2);
        Constructor[] con = c.getConstructors();//获取公共构造
        System.out.println(Arrays.toString(con));
        Constructor[] con1 = c.getDeclaredConstructors();//获取所有构造
        System.out.println(Arrays.toString(con1));

        Constructor con2 = c.getConstructor();//获取单个构造
        System.out.println(con2);
        Constructor con3 = c.getConstructor(String.class);
        System.out.println(con3);
        Constructor con4 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(con4);
        Person p1 = (Person)con2.newInstance();//创建对象
        System.out.println(p1.getName());
        Person p2 = (Person)con3.newInstance("赵四");
        System.out.println(p2.getName());



        Person p3 = (Person)c.newInstance();
        System.out.println(p3.getName()+ p3.getAge());
        Field a = c.getField("age");
        System.out.println(a);
        Field na = c.getDeclaredField("name");
        System.out.println(na);

        a.set(p3,24);
        Integer nn = (Integer) a.get(p3);
        System.out.println(nn);


    }
}
