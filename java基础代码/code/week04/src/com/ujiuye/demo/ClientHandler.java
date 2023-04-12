package com.ujiuye.demo;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable{
    Socket s = new Socket();

    public ClientHandler() {
    }

    public ClientHandler(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            InputStream in = s.getInputStream();
            br = new BufferedReader(
                    new InputStreamReader(in,"UTF-8")
            );
            OutputStream os = s.getOutputStream();
           bw = new BufferedWriter(
                    new OutputStreamWriter(os,"UTF-8")
            );
            int len;
            char[] ch = new char[4];
            while ((len = br.read(ch)) != -1){
                bw.write("你是某某");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(bw != null){
            bw.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(br != null){
                br.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
