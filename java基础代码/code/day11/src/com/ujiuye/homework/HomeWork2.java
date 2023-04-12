package com.ujiuye.homework;

public class HomeWork2 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.length());
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'o'){
                int index = str.indexOf('o',i);
                System.out.print(index +"\t");
            }
        }
        System.out.println();
    }
}
