package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc");

        //FileInputStream fis1 = new FileInputStream("abc");
        //fis1.close();
        /*int len;
        while((len = fis.read()) != -1){
            System.out.print((char)len);
        }
*/
        byte[] by = new byte[4];
        int len1;
        while((len1 = fis.read(by)) != -1){
            System.out.println(new String(by,0,len1));
        }





        fis.close();

    }
}
