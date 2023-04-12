package com.ujiuye.demo;

import sun.security.krb5.internal.CredentialsUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo05 {
    public static void main(String[] args) throws Exception{
        Class c = Person.class;
        Constructor con = c.getDeclaredConstructor(String.class,int.class);
        con.setAccessible(true);
        Person p = (Person)con.newInstance("赵四",46);
        System.out.println(p.getAge() + "000----" + p.getName());
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"ala");
        System.out.println(p.getName());

        Method show = c.getDeclaredMethod("show");
        show.setAccessible(true);
        show.invoke(p);

    }
}
