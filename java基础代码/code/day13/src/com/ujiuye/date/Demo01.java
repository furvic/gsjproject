package com.ujiuye.date;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        Date d1 = new Date(2350974309675395L);
        System.out.println(d1);
        System.out.println(d1.getTime());
        d1.setTime(36000);
        System.out.println(d1);
        BigInteger b = new BigInteger("4286523980283438293");
        Date d2 = new Date(b.longValue());
        System.out.println(d2);
        Date d5 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d5);
        System.out.println(s);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s2 = sdf1.format(d5);
        System.out.println(s2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf3.parse("1995-03-12");
        System.out.println(date);










    }
}
