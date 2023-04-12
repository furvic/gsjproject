package com.ujiuye.test;
        /*定义sym方法,判断数组中的元素值是否对称. 方法的参数列表为int[]数组,
            返回值结果boolean类型,代码实现:
        例如 : 参数数组 int[] arr = {1,2,3,4,5,3,2,1};   方法运行结果: true*/

public class Homework02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        boolean bo = sym(arr);
        System.out.println(bo);

    }
    public static boolean sym(int[] arr){
        if (arr == null || arr.length == 0) {
            return false;
        }else if(arr.length == 1){
            return true;
        }else {
            for (int i = 0; i <= arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    return false;
                }
            /*for(int begin = 0, end = arr.length - 1; begin < end; begin++,end--){
                if(arr[begin] != arr[end]){
                    return false;
                }
            }*/
            }
        }
        return true;
        }



}
