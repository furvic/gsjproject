package com.ujiuye.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Socket01 {
    public static void main(String[] args) throws IOException {
        // 1. 创建出一个客户端的Socket对象,构造方法中,就连接服务器端的IP和端口
        // 如果指定IP和端口无法连接,直接报错: 连接拒绝
        Socket s = new Socket("127.0.0.1",9999);

        // 2. 客户端向服务器端发送数据: 需要一个输出流
        // 获取方式 : Socket套接字类型中,getOutputStream() 获取到字节输出流
        OutputStream os = s.getOutputStream();
        os.write("在吗?服务器".getBytes());

        // 3. 接收从服务器端返回数据: 读取数据,需要一个输入流
        //获取方式 : Socket套接字类型中,getInputStream() 获取到字节输入流
        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);

        System.out.println(new String(b,0,len));

        // 4. 关闭资源
        s.close();
    }
}

