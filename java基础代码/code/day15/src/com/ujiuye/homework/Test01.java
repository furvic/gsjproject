package com.ujiuye.homework;

public class Test01 {
    public static void main(String[] args) {
        String[] str = {"010","3223","666","7890987","123123"};
        getChen(str);

    }
    public static boolean getChen(String[] arr ){
        if (arr != null || arr.length > 0) {
            int count = 0;
            boolean flag = true;
            for(int i = 0; i < arr.length; i++){
                char[] chars = arr[i].toCharArray();
                for(int j = 0; j < chars.length; j++){
                    if(chars[j] != chars[chars.length - 1 - j]){
                        flag = false;
                    }
                }
                if(flag){
                    count++;
                    System.out.print(arr[i] + ",");
                }
            }
            System.out.println("一共有" + count + "个。");
        } else {
            return false;
        }
        return false;

    }
}
