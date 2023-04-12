package com.ujiuye.homework02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        FileOutputStream fos = new FileOutputStream("Info.txt",true);
        while(true){
            System.out.println("请输入字符串：");
            str = sc.next();
            if("886".equals(str)){
                break;
            }else{
                byte[] b = str.getBytes();
                fos.write("\r\n".getBytes());
                fos.write(b);
            }


        }
        fos.close();
        FileInputStream fis = new FileInputStream("Info.txt");
        int len;
        byte[] by = new byte[4];
        while((len = fis.read(by)) != -1){
            System.out.println(new String(by,0,len));
        }
        fis.close();
    }
}
