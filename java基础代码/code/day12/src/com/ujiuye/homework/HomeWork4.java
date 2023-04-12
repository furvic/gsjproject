package com.ujiuye.homework;

public class HomeWork4 {
    public static void main(String[] args) {
        String str = "Hi If you want to change your life , you must work hard !";
        String[] s = str.split(" ");
        int count = 0;
        for(int i = 0; i < s.length; i++){
            char[] ch = s[i].toCharArray();
            if(ch.length == 2){
                System.out.print(s[i] + ",");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
