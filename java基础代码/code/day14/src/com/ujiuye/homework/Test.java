package com.ujiuye.homework;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String time1 = "2021-1-12";
        String time2 = "2021-5-11";
        long lo = getTimeMill(time1,time2);
        if(lo > 0){
            System.out.println("开始时间要小于结束时间。");
        }else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d1 = sdf.parse(time1);
            Date d2 = sdf.parse(time2);
            Date d = new Date();
            long ll = d2.getTime() - d.getTime();
            if(ll > 0){
                System.out.println("结束时间不能大于现在的时间");
            }else{

                Calendar cal = Calendar.getInstance();
                cal.setTime(d1);
                cal.add(Calendar.MONTH,3);
                long l1 = d1.getTime() - d2.getTime();
                if(l1 < 0){
                    System.out.println("时间间隔不能超过3个月");
                }
            }
        }

    }
    public static long getTimeMill(String time1,String time2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(time1);
        Date d2 = sdf.parse(time2);
        return d1.getTime() - d2.getTime();
    }
}
