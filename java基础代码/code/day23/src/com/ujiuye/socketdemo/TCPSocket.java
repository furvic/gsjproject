package com.ujiuye.socketdemo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSocket {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.48.216",9999);
        OutputStream os = s.getOutputStream();
        os.write("在吗在吗在吗".getBytes());
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);//传参传参传参传参传参传参
        System.out.println(new String(b,0,len));
        s.close();


    }
}
