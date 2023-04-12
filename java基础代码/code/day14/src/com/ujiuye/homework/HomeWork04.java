package com.ujiuye.homework;
import java.util.*;
public class HomeWork04 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[5];
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            int a = ran.nextInt(5) + 1;
           for(int j = 0; j < i; j++){
               if(arr[j] == a){
                   flag = false;
                   i--;
                   break;
               }
           }
           if(flag){
               arr[i] = a;
           }
        /*    if(equalsNum(arr,a)){
                arr[i] = a;
            }*/
        }
        System.out.println(Arrays.toString(arr));
    }
    /*public static boolean equalsNum(int[] arr,int k){
        if (arr != null || arr.length >0) {
            for(int i =0; i<arr.length; i++){
                if(arr[i] == k){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }*/
}
