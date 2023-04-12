package com.ujiuye.homework;

import java.util.Arrays;
import java.util.Random;

public class Test04 {
    /*
        4.定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的任意随机数,且保证5个数不重复
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random ran = new Random();
        for(int index = 0; index < arr.length; index++){
            // flag标志表示生成的数据是否重复, true不重复,false表示重复
            boolean flag = true;
            // 1. 生成一个1-99之间的随机数
            int number = ran.nextInt(5) + 1;
            // 2. 验证number数字在arr数组中是否已经存在
            // 将数组中元素遍历一次,看每一个元素与number是否相等
            for(int index1 = 0; index1 < index; index1++){
                if(arr[index1] == number){// 重复
                    flag = false;
                    index--;
                    break;
                }
            }
            // 生成的随机数不重复,为数组指定索引位置进行赋值
            if(flag){
                arr[index] = number;
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
