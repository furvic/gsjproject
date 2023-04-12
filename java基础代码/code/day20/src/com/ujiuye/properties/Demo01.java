package com.ujiuye.properties;

import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("1","a");
        p.setProperty("3","a");
        p.setProperty("4","g");
        p.setProperty("1","a");
        String val = p.getProperty("3");

        Set<String> set = p.stringPropertyNames();
        for(String key : set){
            String value = p.getProperty(key);
            System.out.println(key + "-------" + value);
        }

    }
}
