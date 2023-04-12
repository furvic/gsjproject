package com.ujiuye.system;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("----------学生管理系统------------");
        while(true){
            System.out.println("1,请添加一名学生：");
            System.out.println("2,请输入查询信息：");
            System.out.println("3,请选择要删除的学生：");
            System.out.println("4,请输入要修改学生的信息：");
            System.out.println("5,退出系统");
            String c = sc.nextLine();
            switch (c){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    readStudent(list);
                    break;
                case "3":
                    deleStudent(list);
                    break;
                case "4":
                    reStudent(list);
                    break;
                case "5":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("数据输入有误，请重新输入。");
                    break;
            }
        }

    }
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id;
        while(true){
            System.out.println("请输入添加学生的信息：");
            id = sc.nextLine();
            int count = 0;
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                if(s.getSid().equals(id)){
                    System.out.println("请重新输入一个学号：");
                    break;
                }
                count++;
            }
            if(count == list.size()){
                break;
            }
        }
        System.out.println("请输入学生的名字：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的生日：");
        String birth = sc.nextLine();
        Student s = new Student(id,name,age,birth);
        list.add(s);
        System.out.println("添加成功。");
    }
    public static void readStudent(ArrayList<Student> list){
       System.out.println("学号   姓名   年龄   生日");
       for(int i = 0; i < list.size(); i++){
           Student s = list.get(i);
           System.out.print(s.getSid() + "   " + s.getName()+ "   " + s.getAge() + "岁  " + s.getBirth());
       }
        System.out.println();
    }
    public static void  deleStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入要删除的学生的信息：");
            String id = sc.nextLine();
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                if (s.getSid().equals(id)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("信息不存在");
                continue;
            } else {
                list.remove(index);
                break;
            }
        }
        System.out.println("删除成功");
    }
    public static void reStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入修改学生的学号：");
            String id = sc.nextLine();
            int index = -1;
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                if(s.getSid().equals(id)){
                    index = i;
                    break;
                }
            }
            if(index == -1){
                System.out.println("信息有误");
                continue;
            }else {
                System.out.println("请输入新的学号：");
                String sid = sc.nextLine();
                System.out.println("请输入新的姓名：");
                String name = sc.nextLine();
                System.out.println("请输入新的年龄：");
                int age = sc.nextInt();
                System.out.println("请输入新的生日：");
                String birth = sc.nextLine();
                Student s = new Student(sid,name,age,birth);
                list.set(index,s);
                break;
            }
        }


    }


}
