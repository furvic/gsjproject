package com.ujiuye.io;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("abc")
        );
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("abcCopy")
        );
        int len;
        char[] ch = new char[4];
        while ((len = br.read(ch)) != -1){
            bw.write(ch,0,len);
        }
        br.close();
        bw.close();
    }
}
