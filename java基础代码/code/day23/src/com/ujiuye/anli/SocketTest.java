package com.ujiuye.anli;

import java.io.*;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Pictures\\5.jpg");
        Socket s = new Socket("192.168.48.216",8888);
        OutputStream os = s.getOutputStream();
        byte[] b1 = new byte[1024 * 32];
        int len;
        while((len = fis.read(b1))!= -1){
            os.write(b1,0,len);
        }
        s.shutdownOutput();
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024 * 8];
        int len1 = is.read(b);
        System.out.println(new String(b,0,len1));
        s.close();
    }
}
