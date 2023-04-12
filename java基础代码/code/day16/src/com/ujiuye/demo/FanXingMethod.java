package com.ujiuye.demo;

import java.util.Arrays;

public class FanXingMethod {
    public static<T> void changeArrayzEle(T[] arr, int index, int index1){
        T temp = arr[index];
        arr[index] = arr[index1];
        arr[index1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
