package com.ujiuye.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        while (true){
            Socket s = ss.accept();
            new Thread(
                    new ClientHandler(s){}
            ).start();
            ss.close();
        }
    }
}
