package com.ujiuye.stringbuilder;

public class Test {
    public static void main(String[] args) {
        String str = "abc";
        String sb = getRerverse(str);
        System.out.println(sb);
    }

    public static String getRerverse(String str){

        if (str != null && !str.isEmpty()) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return String.valueOf(str);
        } else {
            System.out.println("cuowu");
            return "";
        }
    }
}
