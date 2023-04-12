package com.ujiuye.demo;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setClassNo(3);
        s.schoolName = "第一高中";
        System.out.println(s.getName() + s.getClassNo());
        System.out.println(Student.schoolName);
    }
}
