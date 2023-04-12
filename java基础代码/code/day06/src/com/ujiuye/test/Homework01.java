package com.ujiuye.test;

public class Homework01 {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = "黑桃";
        arr[1] = "红桃";
        arr[2] = "梅花";
        arr[3] = "方片";
        String[] arr1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr1.length; j++){
                System.out.print(arr[i]+arr1[j] + " ");
            }
            System.out.println();

        }

    }
}
