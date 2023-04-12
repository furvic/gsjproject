package com.ujiuye.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Info.txt");
        int len;
       /* while ((len = fr.read()) != -1){
            System.out.print((char)len);
        }*/
        char[] ch = new char[3];
        while ((len = fr.read(ch)) != -1){
            System.out.print(new String(ch,0,len));
        }

        fr.close();

        FileWriter fw = new FileWriter("abc",true);
        fw.write('S');
        fw.write("\r\n");
        char[] ch1 = {'a','2','v','>'};
        fw.write(ch1);
        fw.write("\r\n");
        fw.write(ch1,0,2);
        String s = "我所";
        fw.write("\r\n");
        fw.write(s);
        fw.write("\r\n");
        fw.write(s,0,1);

        fw.close();

    }
}
