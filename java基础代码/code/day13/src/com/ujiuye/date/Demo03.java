package com.ujiuye.date;

import java.text.NumberFormat;

public class Demo03 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumIntegerDigits(2);
        nf.setMinimumFractionDigits(1);
        String s = nf.format(2.1999);
        System.out.println(s);

        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        String s1 = nf1.format(3.24);
        System.out.println(s1);
    }
}
