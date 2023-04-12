package com.ujiuye.test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {6,2,9,15,1,5,20,7,18};
        Test1 t = new Test1();
        t.printArray(arr);
        t.getMax(arr);
        t.getMin(arr);
        t.swapArray(arr, 0 ,t.getMin(arr));
        t.swapArray(arr, arr.length - 1 ,t.getMax(arr));
        t.printArray(arr);
    }
    public int getMax(int[] arr){
        if (arr != null || arr.length > 0) {
            int count = 0;
            int max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                    count = i;
                }
            }
            System.out.println(max);
            return count;
        } else {
            return -1;

        }
    }
    public int getMin(int[] arr){
        if (arr != null || arr.length >0) {
            int index = 0;
            int min = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                    index = i;
                }
            }
            System.out.println(min);
            return index;
        } else {
            return -1;
        }
    }
    public void swapArray(int[] arr, int count, int index){
        if (arr != null || arr.length >0) {
            int temp = arr[count];
            arr[count] = arr[index];
            arr[index] = temp;
        } else {
            System.out.println("数组有误");
        }
    }
    public void printArray(int[] arr){
        if(arr != null || arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println("数组有误");
        }
    }
}
