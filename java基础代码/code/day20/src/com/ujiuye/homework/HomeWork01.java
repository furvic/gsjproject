package com.ujiuye.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("D:\\utf-8.txt"),"UTf-8"
        );
        int len;
        char[] ch = new char[1024];
        while((len = isr.read(ch)) != -1){
            System.out.println(new String(ch,0,len));
        }
        isr.close();
    }
}
