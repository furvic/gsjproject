package com.ujiuye.homework;

import java.io.*;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("stu.txt")
        );
        System.out.println("请输入学生的成绩");
        String str = sc.next();
            String[] s = str.split(",");
            Student stu = new Student(s[0],Integer.parseInt(s[1]),Integer.parseInt(s[2]),Integer.parseInt(s[3]));
            String name = stu.name;
            int c = stu.china;
            int m = stu.math;
            int e = stu.english;
            StringBuilder sb = new StringBuilder();
            sb.append(name + ":");
            sb.append(c+ ",");
            sb.append(m+ ",");
            sb.append(e);
            bw.write(sb.toString());


        bw.flush();
        bw.close();
    }
}
