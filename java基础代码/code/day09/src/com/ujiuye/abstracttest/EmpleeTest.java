package com.ujiuye.abstracttest;

public class EmpleeTest {
    public static void main(String[] args) {
        Emplee p = new Programmer();
        p.setName("旺旺");
        p.setId("007");
        p.work();
        Emplee t = new Tester("wanger","322",34445.09);
        t.work();
    }
}
