package com.ujiuye.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo02 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress in = InetAddress.getLocalHost();
        System.out.println(in);//ALJS-20180826YQ
        InetAddress in1 = InetAddress.getByName("ALJS-20180826YQ");
        System.out.println(in1);
        InetAddress in2 = InetAddress.getByName("192.168.48.216");
        System.out.println(in2);
        String name = in2.getHostName();
        System.out.println(name);
        String name2 = in2.getHostAddress();
        System.out.println(name2);
        String n3 = in2.toString();
        System.out.println(n3);
    }
}
