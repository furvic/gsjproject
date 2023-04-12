package com.ujiuye.demo;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        System.out.println("请输入：");
        int a = is.read();
        System.out.println(a);

        System.setIn(new FileInputStream("Info.txt"));
        System.out.println(System.in.read());
        System.out.println(System.in.read());
        System.out.println(System.in.read());


        System.setOut(new PrintStream("abc.txt"));
        System.out.println("我是郭淑洁");
    }

}
