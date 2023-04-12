package com.ujiuye.demo;

import java.io.*;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.48.216",9999);
        InputStream in = s.getInputStream();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(in,"UTF-8")
        );
        OutputStream os = s.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        char[] ch = new char[4];
        int len;
        while ((len = br.read(ch)) != -1){
            osw.write("我是某某");
        }
        s.close();

    }
}
