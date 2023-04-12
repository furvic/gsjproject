package com.ujiuye.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        String path = "write.txt";
        FileOutputStream fos = new FileOutputStream(path);
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }else{
            fos.write('A');
            byte[] by = {97,98,99,100};
            fos.write("\n".getBytes());
            fos.write(by,0,2);
            fos.write("\n今天一定要下雨".getBytes());
        }
        fos.close();
        FileOutputStream fos1 = new FileOutputStream(path,true);
        fos1.write("\n追加内容".getBytes());



        fos1.close();
    }
}
