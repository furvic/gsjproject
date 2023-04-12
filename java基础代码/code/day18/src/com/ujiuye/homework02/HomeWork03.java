package com.ujiuye.homework02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("1.txt");
        fos.write("你好".getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream("1.txt");
        char s = (char)fis.read();
        System.out.println(s);
        fis.close();
    }
}
