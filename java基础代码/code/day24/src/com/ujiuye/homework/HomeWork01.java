package com.ujiuye.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class HomeWork01 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        p.load(new FileInputStream("run.properties"));
        String className = p.getProperty("className");
        System.out.println(className);
        String method = p.getProperty("methodName");
        System.out.println(method);
       Class c1 = Class.forName(className);
        System.out.println(c1);
        Constructor con = c1.getConstructor();
        System.out.println(con);
         Object o1 = con.newInstance();
        Method m = c1.getDeclaredMethod(method,int.class,int.class);
        System.out.println(m);
        m.invoke(o1,4,5);
        System.out.println(o1);



    }
}
