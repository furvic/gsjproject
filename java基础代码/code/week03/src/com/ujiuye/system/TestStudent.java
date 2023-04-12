package com.ujiuye.system;

import com.sun.org.apache.xml.internal.security.c14n.implementations.Canonicalizer11_WithComments;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import javax.naming.BinaryRefAddr;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------学生管理系统---------------");
        ArrayList<Student> list = new ArrayList<>();
        while (true){
            System.out.println("按规定操作:");
            System.out.println("1：添加学生  2：查看学生信息  3：删除学生信息   4：修改学生信息   5: 退出系统");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    redStudent(list);
                    break;
                case 3:
                    deleStudent(list);
                    break;
                case 4:
                    reStudent(list);
                    break;
                case 5:
                    System.out.println("退出系统。");
                    return;//结束方法
                default:
                    System.out.println("信息输入有误，请重新输入：");
                    break;
            }
        }
    }
    public static ArrayList<Student> addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入添加学生的信息：");
        String id;
        while(true){
        System.out.println("请输入学生的学号：");
            id = sc.nextLine();
            int count = 0;
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                if(s.getId().equals(id)){
                    System.out.println("该学号已经存在，请重新输入：");
                    break;
                }else {
                    count++;
                }
            }
            if(count == list.size()){
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的生日：");
        String birth = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();

        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setBirth(birth);
        System.out.println(s.getBirth());
        list.add(s);
        System.out.println("添加信息成功");
        System.out.println(list);
        return list;
    }
    public static void redStudent(ArrayList<Student> list){
        System.out.println("学号   姓名   年龄   生日");
        for(int i = 0; i < list.size(); i++){
            Student s = list.get(i);
            System.out.println(s.getId() +"   "+ s.getName() +"   "+ s.getAge() +"岁  "+ s.getBirth());
        }
    }
    public static ArrayList<Student> deleStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("删除学生信息");
        while(true){
            System.out.println("请输入学生的学号：");
            String sid = sc.nextLine();
            int index = -1;
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                if(s.getId().equals(sid)){
                    index = i;
                    break;
                }
            }
            if(index == -1){
                System.out.println("信息不存在");
                continue;
            }else {
                list.remove(index);//删除索引的学生
                System.out.println("删除成功");
                break;
            }
        }
        return list;
    }
    public static ArrayList<Student> reStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("修改学生信息");
        while(true){
            System.out.println("请输入要修改的学生的学号");
            String sid = sc.nextLine();
            int index = -1;
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                if(s.getId().equals(sid)){
                    index = i;
                    break;
                }
            }
            if(index == -1){
                System.out.println("信息有误，找不到学生");
                continue;
            }else{
                System.out.println("请输入新的学生学号：");
                String id = sc.nextLine();
                System.out.println("请输入新的学生姓名：");
                String name = sc.nextLine();
                System.out.println("请输入新的学生生日：");
                String birth = sc.nextLine();
                System.out.println("请输入新的学生年龄：");
                int age = sc.nextInt();
                Student ss = new Student(id,name,age,birth);
                list.set(index,ss);
                System.out.println("修改成功");
                break;
            }
        }

        return list;
    }

}
