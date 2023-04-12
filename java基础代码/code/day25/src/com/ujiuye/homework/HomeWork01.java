package com.ujiuye.homework;

import java.util.Date;

public class HomeWork01 {
    public static void main(String[] args) {
        CurrentTimePrint ct = () -> { System.out.println(new Date().getTime()); };
        showLongTime(ct);
    }

    public static void showLongTime( CurrentTimePrint c){
        c.printCurrentTime();
    }
}
@FunctionalInterface
interface CurrentTimePrint{
    void printCurrentTime();
}
