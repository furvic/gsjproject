
package com.ujiuye.stringbuilder;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String sb = getString(arr);
        System.out.println(sb);
    }
    public static String getString(int[] arr){

        if (arr != null && arr.length > 0) {
            StringBuilder sb = new StringBuilder("[");
            for(int i = 0; i < arr.length; i++){
                int ele = arr[i];
                if(i == arr.length - 1){
                    sb.append(ele + "]");
                }else{
                    sb.append(ele);
                }
            }
            return sb.toString();
        } else {
            System.out.println("错误");
            return "";
        }
    }
}
