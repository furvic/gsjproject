
package com.ujiuye.homework;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] in = new int[5];
        for(int i = 0; i < in.length; i++){
            boolean flag = true;
            int num = ran.nextInt(5) + 1;

                /*if(isEquals(in,num)){
                    in[i] = num;
                }
*/

            for(int j = 0; j < i; j++){
                if(in[j] == num){
                    flag = false;
                    i--;
                    break;
                }
            }
            if(flag){
                in[i] = num;
            }
        }
        System.out.println(Arrays.toString(in));

    }
   /* public static boolean isEquals(int[] arr,int key){
        if(arr != null || arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == key){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }*/
}
