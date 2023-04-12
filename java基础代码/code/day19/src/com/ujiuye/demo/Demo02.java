package com.ujiuye.demo;

import java.io.*;
import java.lang.management.BufferPoolMXBean;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("C:\\Users\\Administrator\\Desktop\\系统班\\java基础\\day04\\视频\\01.day03内容回顾.mp4")
        );
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\1.mp4")
        );
        int len;
        while ((len = bis.read()) != -1){
            bos.write(len);
        }

        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        BufferedInputStream bis1 = new BufferedInputStream(
                new FileInputStream("D:\\s.txt")
        );
        BufferedOutputStream bos1 = new BufferedOutputStream(
                new FileOutputStream("D:\\copy11.txt")
        );
        int len1;
        while ((len1 = bis1.read()) != -1){
            bos1.write(len1);
        }
        bos1.flush();
        bos1.write("你好呀".getBytes());
        bos1.flush();
        bis1.close();
        bos1.close();

    }
}
