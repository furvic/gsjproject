package com.ujiye.homework;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.setName("李怡霖");
        p.setNo("007");
        Teacher t = (Teacher) p;
        t.setJob("讲师");
        t.setDapart("Java基础");
        p.messagePrint();
        Person p1 = new Student();
        p1.setName("郭淑洁");
        p1.setNo("008");
        Student s = (Student) p1;
        s.setClassNo(3);
        s.setScore("优秀");
        p1.messagePrint();
    }
}
