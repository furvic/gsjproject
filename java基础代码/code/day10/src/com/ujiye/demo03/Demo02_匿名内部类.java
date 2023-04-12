package com.ujiye.demo03;

public class Demo02_匿名内部类 {
    public static void main(String[] args) {
        new Interface(){
            @Override
            public void fun() {
                System.out.println("我是借口");
            }
            @Override
            public boolean boo(double d1, double d2) {
                return d1 == d2;
            }
        }.fun();
        System.out.println(new Interface(){
            @Override
            public void fun() {
                System.out.println("我是借口");
            }
            @Override
            public boolean boo(double d1, double d2) {
                return d1 == d2;
            }
        }.boo(3.14,3.14));

        Interface t = new Interface() {
            @Override
            public void fun() {
                System.out.println("我是重写的");
            }

            @Override
            public boolean boo(double d1, double d2) {
                return d1 == d2;
            }
        };
        t.fun();
        System.out.println(t.boo(3.14,4.23));
    }

}
