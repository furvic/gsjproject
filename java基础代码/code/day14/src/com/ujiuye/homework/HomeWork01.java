package com.ujiuye.homework;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        String[] arr = {"010","3223","666","7890987","123123"};
        getSymm(arr);
    }
    public static void getSymm(String[] arr){
        if (arr != null || arr.length > 0) {
            int count = 0;
            boolean flag = true;
            for(int i = 0; i < arr.length; i++){
               char[] ch = arr[i].toCharArray();
               for(int j = 0; j < ch.length/2; j++){
                   if(ch[j] != ch[ch.length - 1 - j]) {
                      flag = false;
                        }
                   }
                if(flag){
                    count++;
                    System.out.print(arr[i] + ",");
                }
               }
            System.out.println();

            System.out.println("一共有" + count + "个。");
        } else {
            System.out.println("数组输入有误");
        }
    }
}
