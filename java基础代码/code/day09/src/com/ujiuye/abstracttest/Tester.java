package com.ujiuye.abstracttest;

public class Tester extends Emplee{
    public Tester() {
    }

    public Tester(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println( getName() + "的工作是测试，工号是" + getId());
    }
}
