package com.ujiuye.homework;
import java.util.*;
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int low = 0;
        int up = 0;
        int num = 0;
        int oth = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 48 && ch[i] <= 57){
                num++;
            }else if(ch[i] >= 65 && ch[i] <= 90){
                up++;
            }else if(ch[i] >= 97 && ch[i] <= 122){
                low++;
            }else{
                oth++;
            }
        }
        System.out.println("小写字符有" + low + "个，大写字符有" + up + "个，数字有" + num + "个，其他字符有" + oth + "个。");
    }
}
