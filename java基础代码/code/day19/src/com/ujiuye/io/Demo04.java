package com.ujiuye.io;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("1.txt")
        );
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("1copy.txt")
        );
        String s;
        while ((s = br.readLine()) != null){
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
