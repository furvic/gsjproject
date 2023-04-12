package com.ujiuye.anli;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        File f = new File("D:\\download\\copy1.jpg");
        if(!f.exists()){
            f.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(f);
        int len;
        byte[] b = new byte[1024 * 32];
        while((len = is.read(b)) != -1){
            fos.write(b,0,len);
        }
        OutputStream os = s.getOutputStream();
        os.write("成功".getBytes());
        ss.close();
    }
}
