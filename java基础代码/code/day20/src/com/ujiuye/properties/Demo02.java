package com.ujiuye.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("config.properties"));

        Set<String> set = p.stringPropertyNames();
        for(String key : set){
            String value = p.getProperty(key);
            System.out.println(key +"----- "+ value);
        }
        p.setProperty("uesername","furiesvic");
        p.store(new FileOutputStream("config.properties"),"change name");
    }
}
