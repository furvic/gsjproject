package com.ujiuye.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 3; i++){
            System.out.println("请输入第" + i + "次数据信息。");
            String s = sc.nextLine();
            String[] str = s.split(",");
            String name = str[0];
            for(int j = 1; j < str.length; j++){
                sum += Integer.parseInt(str[i]);
            }
            Student stu = new Student(name,sum);
            set.add(stu);
            FileWriter fw = new FileWriter("stu.txt");
            for(Student ss : set){
                fw.write(ss.getName());
                fw.write(",");
                fw.write(String.valueOf(ss.getTotal()));
                fw.write("\r\n");
            }
            fw.close();
        }
    }
}
