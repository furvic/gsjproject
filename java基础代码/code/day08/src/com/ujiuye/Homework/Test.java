package com.ujiuye.Homework;

public class Test {
    public static void main(String[] args) {
        int[] arr = {6,2,9,15,1,5,20,7,18};
        Test t = new Test();
        t.printArray(arr);
        System.out.println("*&^%$#$%^&*&^%$#$%^&^%$#$%^&");
        System.out.println(t.getMax(arr));
        System.out.println("*&^%$#$%^&*&^%$#$%^&^%$#$%^&");
        System.out.println(t.getMin(arr));
        System.out.println("*&^%$#$%^&*&^%$#$%^&^%$#$%^&");
        t.swapArray(arr,t.getMax(arr),arr.length - 1);
        t.swapArray(arr,t.getMin(arr),0);
        t.printArray(arr);

    }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
        System.out.println();
    }
    public int getMax(int[] arr){
        int max = arr[0];
        int count = 0;
        for( int index  = 0; index < arr.length; index++){
            if(max < arr[index]){
                max = arr[index];
                count = index;
            }
        }
        return count;
    }
    public int getMin(int[] arr){
        int min = arr[0];
        int count = 0;
        for( int i = 0;i < arr.length; i++){
            if(min > arr[i]){
                min  = arr[i];
                count = i;//求得最值的索引位置
            }
        }
        return count;
    }
    public void swapArray(int[] arr,int num, int i){
        int temp = arr[num];
        arr[num] = arr[i];
        arr[i] = temp;


    }

}
