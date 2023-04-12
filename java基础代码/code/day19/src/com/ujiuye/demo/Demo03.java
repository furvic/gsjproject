package com.ujiuye.demo;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) {
        BufferedInputStream bis1 = null;
        BufferedOutputStream bos1 = null;
        try {
            bis1 = new BufferedInputStream(
                    new FileInputStream("D:\\s.txt")
            );
            bos1 = new BufferedOutputStream(
                    new FileOutputStream("D:\\copy11.txt")
            );
            int len1;
            while ((len1 = bis1.read()) != -1){
                bos1.write(len1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis1 != null){
                    bis1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos1 != null){
                    bos1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*bos1.flush();
        bos1.write("你好呀".getBytes());
        bos1.flush();*/
        try (
                FileInputStream fis = new FileInputStream("Info.txt");
                FileOutputStream fos = new FileOutputStream("D:\\Info.txt");
                ){
            int len;
            while ((len = fis.read()) != -1){
                fos.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
