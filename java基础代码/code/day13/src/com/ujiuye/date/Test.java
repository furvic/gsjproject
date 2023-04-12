package com.ujiuye.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        long time = d.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse("1993-08-01");
        long birth = d1.getTime();
        long ll = time - birth;
        System.out.println(ll / 1000 / 60 / 60 / 24);
    }
}
