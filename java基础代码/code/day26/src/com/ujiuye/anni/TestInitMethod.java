package com.ujiuye.anni;

import java.lang.reflect.Method;

public class TestInitMethod {
    public static void main(String[] args) throws Exception{
        Class<UseInitMethod> c = UseInitMethod.class;
        UseInitMethod use = c.newInstance();
        Method[] ms = c.getDeclaredMethods();
        for(Method m : ms){
            boolean boo = m.isAnnotationPresent(InitMethod.class);
            if(boo){
                m.invoke(use);
            }
        }

    }
}
