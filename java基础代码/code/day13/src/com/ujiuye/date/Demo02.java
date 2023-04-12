package com.ujiuye.date;

import java.util.Calendar;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minu = cal.get(Calendar.MINUTE);
        int sce = cal.get(Calendar.SECOND);
        System.out.println(year + "," + month + "," + day + "," + hour + "," + minu + "," + sce);
        cal.set(Calendar.YEAR,2012);
        System.out.println(cal.get(Calendar.YEAR));
        cal.add(Calendar.DAY_OF_MONTH,25);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        Date d = cal.getTime();
        System.out.println(d);

    }
}
