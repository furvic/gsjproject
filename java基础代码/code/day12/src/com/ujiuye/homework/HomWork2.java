package com.ujiuye.homework;
import java.util.*;
public class HomWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("请输入整数：");
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int i = 0;
        String j = "";
        if(n != 0 || n < 0){
            for(; i < n; i++){
                 j = sc.nextLine();
                if(j != null || j.length() < 0){
                    if("end".equals(j)){
                        for(int m = 0; m < (n - i); m++){
                            sb.append(",0");
                        }
                        break;
                    }else if(i == n - 1){
                        sb.append( "," + j );
                    }else if(i == 0){
                        sb.append("[" + j );
                    }else{
                        sb.append( "," + j );
                    }
                    if(Integer.parseInt(j) > max){
                        max = Integer.parseInt(j);
                    }
                }else{
                    System.out.println("数据输入有误");
                }
            }
            System.out.println("数组中的元素是" + sb + "]" + "，最大值是" + max);

        }else{
            System.out.println("数据输入有误");
        }


    }
}
