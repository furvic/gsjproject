package com.ujiuye.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("student.txt")
        );
        HashSet<Student> set = new HashSet<>();
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = br.readLine()) != null){
            System.out.println(s);
            sb.append(s + ",");
        }
        String ss = sb.toString();
        System.out.println(ss);
        String[] str = ss.split(",");
        System.out.println(Arrays.toString(str));
        set.add(new Student(str[0],Integer.parseInt(str[1])));
        set.add(new Student(str[2],Integer.parseInt(str[3])));
        set.add(new Student(str[4],Integer.parseInt(str[5])));
        for(Student stu : set){
            System.out.println(stu);
        }

        br.close();
    }
}
