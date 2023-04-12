package com.ujiuye.datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b,b.length);
        System.out.println("准备接受数据：");
        ds.receive(dp);
        System.out.println("接受数据完成");
        int num = dp.getLength();
        int port = dp.getPort();
        InetAddress in = dp.getAddress();
        System.out.println(in + "--" + port + "--" + new String(b,0,num));
       /* int port1 = ds.getPort();
        InetAddress in1 = ds.getInetAddress();
        System.out.println(port1 +"---"+ in1);*/
        ds.close();
    }
}
