package com.ujiuye.demo;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1,43};
        getEleFromError(arr,2);
    }
    public static void getEleFromError(int[] arr,int index){
        if(arr == null || arr.length == 0){
            throw new NullPointerException("空指针异常");
        }
        if(index < 0 || arr.length <= index){
            throw new ArrayIndexOutOfBoundsException("越界异常");
        }
        System.out.println(arr[index]);
    }
}
