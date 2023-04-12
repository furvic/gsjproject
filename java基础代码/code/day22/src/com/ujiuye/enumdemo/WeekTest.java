package com.ujiuye.enumdemo;

public class WeekTest {
    public static void main(String[] args) {
        WeekEnum we = WeekEnum.FIR;
        WeekEnum we1 = WeekEnum.MOD;
        WeekEnum w2 = WeekEnum.MON;
        WeekEnum w3 = WeekEnum.THUR;
        WeekEnum w4 = WeekEnum.TUE;
        System.out.println(we);
        System.out.println(we1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        System.out.println(we.getName());
        System.out.println(we1.getName());
        System.out.println(w2.getName());
        System.out.println(w3.getName());
        System.out.println(w4.getName());
        we.show();
        we1.show();
        w4.show();
        System.out.println(we.ordinal());
        System.out.println(we1.compareTo(w2));
        System.out.println(w3.name());
        System.out.println(w4.toString());
        WeekEnum[] week = WeekEnum.values();
        for(WeekEnum wee : week){
            System.out.println(wee);
        }
    }
}
