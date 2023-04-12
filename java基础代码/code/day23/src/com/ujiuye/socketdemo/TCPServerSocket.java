package com.ujiuye.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("准备接受数据");
        Socket s = ss.accept();
        System.out.println("接收到了客户端的套接字:");
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        System.out.println(new String(b,0,len));
        OutputStream os = s.getOutputStream();
        os.write("我在我在我在".getBytes());
        ss.close();
    }
}
