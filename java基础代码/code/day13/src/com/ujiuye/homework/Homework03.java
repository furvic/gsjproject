package com.ujiuye.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework03 {
    public static void main(String[] args) throws ParseException {
        String s = "2021-5-12";
        String s1 = "2021-5-16";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        Date d1 = sdf.parse(s);
        Date d2 = sdf.parse(s1);
        long t = d.getTime();
        long t1 = d1.getTime();
        long t2 = d2.getTime();
        if(t2 - t1 > 0 && t - t2 > 0 && (t2 - t1) / 1000 / 60 / 60 / 24 / 30 <= 3 ){
            System.out.println("可以查询");
        }
    }
}
