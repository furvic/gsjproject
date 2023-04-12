package com.ujiuye.datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class PacketTestSenter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        while (true){
            System.out.println("请输入");
            String s = sc.next();
            byte[] b = s.getBytes();
            DatagramPacket dp = new DatagramPacket(b,b.length, InetAddress.getByName("192.168.48.216"),8888);
            ds.send(dp);
        }
        //ds.close();
    }
}
