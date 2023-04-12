package com.ujiuye.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        FileWriter fw = new FileWriter("D:\\s.txt",true);
        fw.write("\r\n");
        fw.write("用户名：" + username);
        fw.write("\r\n");
        fw.write("密码：" + password);

        fw.close();
    }
}
