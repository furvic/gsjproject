package com.ujiuye.duotaiTest;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new SuperMan();
        p.dealBui();
        SuperMan s = (SuperMan)p;
        s.setName("维多利亚");
        s.dealBui();
        s.fly();

    }
}
