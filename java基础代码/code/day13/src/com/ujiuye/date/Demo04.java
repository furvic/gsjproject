package com.ujiuye.date;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {31,33,53,65,66,87,89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,65);
        System.out.println(index);
    }
}
