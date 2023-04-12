package com.ujiuye.homework;

import java.util.*;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.println("请输入年份：");
        cal.set(Calendar.YEAR,sc.nextInt());
        int year = cal.get(Calendar.YEAR);
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println( year + "年是一个闰年");
        }else{
            System.out.println( year + "年是一个平年");
        }
    }
}
