package com.ujiuye.datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PacketTest {
    public static void main(String[] args) throws IOException {
        byte[] b = "你好UDP".getBytes();
        DatagramPacket dp = new DatagramPacket(b,b.length, InetAddress.getByName("127.0.0.1"),8888);
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
        ds.close();
    }
}
