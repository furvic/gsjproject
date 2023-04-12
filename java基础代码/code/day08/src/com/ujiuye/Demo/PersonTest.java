package com.ujiuye.Demo;

public class PersonTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(23);
        t.setName("散散");
        t.teach();
        Student s = new Student();
        s.setAge(3);
        s.setName("二二");
        s.study();
        Teacher t1 = new Teacher();
    }
}
