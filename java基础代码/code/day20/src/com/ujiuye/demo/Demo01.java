package com.ujiuye.demo;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("D:\\1.txt"),"GBK"
        );
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("D:\\utf-8.txt"),"UTF-8"
        );
        int len;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }

        isr.close();
        osw.close();
    }
}
