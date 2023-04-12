package com.ujiuye.shujulexingzhuanhuan;

public class Test2 {
    public static void main(String[] args) {
        Integer i = new Integer("78900");
        byte b =i.byteValue();
        System.out.println(b);
        double d = i.doubleValue();
        System.out.println(d);
        int i1 = Integer.parseInt("4635");
        System.out.println(i1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);

    }
}
