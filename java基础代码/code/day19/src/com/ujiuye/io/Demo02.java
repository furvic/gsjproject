package com.ujiuye.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Info.txt");
        FileWriter fw = new FileWriter("Infocopy.txt");
        int len;
        while ((len = fr.read()) != -1){
            fw.write(len);
        }
        fr.close();
        fw.close();
    }
}
