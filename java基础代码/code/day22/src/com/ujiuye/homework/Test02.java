package com.ujiuye.homework;

public class Test02 {
    public static void main(String[] args) {
        for(int i = 2; i<= 1000; i++){
            int s = 0;
            for(int n = i; n >0; n/=10){//153,--->3---->5----->1
                int g = n % 10;
                s += g * g * g;
                }
            if(s == i){
                System.out.println(i);
            }
        }
        int[] ary = {1,0,1,1,0,0,1,1,1,0,0,1,0,1};
        int index = 0;//声明一个索引变量
        for(int i=0;i<ary.length;i++){
            if(ary[i]==0){
                ary[i] = 1;
                ary[index] = 0;//将初始化的变量索引赋值给数组中的元素，即index的索引永远比i值提前一步赋值为0
                index++;//随着i值变动
            }
            /*for(int index = i; index < ary.length; index++){
                if(ary[index] == 0){
                    ary[index] = 1;
                }else{
                    ary[index] = 0;
                }
            }*/
        }
        for(int i:ary){
            System.out.print(i+" ");
        }
    }
}
