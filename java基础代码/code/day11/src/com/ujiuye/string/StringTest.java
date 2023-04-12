package com.ujiuye.string;

public class StringTest {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "abc";
        System.out.println(s == s1);
        String s2 = new String("abc");
        System.out.println(s == s2);

        char[] ch = {'1','d','h','在'};
        String str = new String(ch);
        System.out.println(str);
        String str1 = new String(ch,1,3);
        System.out.println(str1);
        byte[] b = {97,98,99,100};
        String s4 = new String(b);
        System.out.println(s4);
        String s5 = new String(b,2,2);
        System.out.println(s5);
    }
}
