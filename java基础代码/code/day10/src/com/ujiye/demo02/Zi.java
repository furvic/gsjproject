package com.ujiye.demo02;

public class Zi extends Fu implements Interface3{
    @Override
    public void sing() {
        System.out.println("唱啊唱啊");
    }

    @Override
    public int getSum(int x, int y) {
        return x + y;
    }

    @Override
    public void see() {
        System.out.println("看见了");
    }

    @Override
    public void print() {
        System.out.println("print********^*^^^^^&*");
    }
}
