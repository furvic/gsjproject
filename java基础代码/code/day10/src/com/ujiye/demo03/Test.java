package com.ujiye.demo03;

public class Test {
    public static void main(String[] args) {
        Outter o = new Outter();
        o.useInnter();

        Outter.Innter in = new Outter().new Innter();
        System.out.println(in.color);
        in.show();
    }
}
