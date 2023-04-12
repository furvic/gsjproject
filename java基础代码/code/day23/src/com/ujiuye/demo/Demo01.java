package com.ujiuye.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws UnknownHostException {
        // 1. 利用InetAddress中静态方法,创建出一个对象
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia);// LAPTOP-GBN4PA9J/192.168.48.207

        // 2.getByName(String host) : 通过主机名host或者ip地址获取到对应的InetAddress类对象
        InetAddress ia2 = InetAddress.getByName("LAPTOP-GBN4PA9J");
        System.out.println(ia2);// LAPTOP-GBN4PA9J/192.168.48.207

        InetAddress ia3 = InetAddress.getByName("192.168.48.207");
        System.out.println(ia3);// /192.168.48.207

        /*1.getHostName(): :获取主机名,返回值类型String类型
        2.getHostAddress() : 获取到IP地址,返回值类型String类型
        3.toString() : 将一个InetAddress对象结果转换成字符串,返回值类型字符串*/
        String name = ia2.getHostName();
        System.out.println(name);// LAPTOP-GBN4PA9J

        String ip = ia2.getHostAddress();
        System.out.println(ip);// 192.168.48.207

        String str = ia2.toString();
        System.out.println(str);// LAPTOP-GBN4PA9J/192.168.48.207
    }
}

