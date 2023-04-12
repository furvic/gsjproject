package com.ujiuye.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Pictures\\6.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\copy1.jpg");
        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }
        fis.close();
        fos.close();

    }
}
