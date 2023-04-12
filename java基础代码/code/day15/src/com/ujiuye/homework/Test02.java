package com.ujiuye.homework;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码：");
        String str = sc.nextLine();
        getTel(str);
    }
    public static void getTel(String str){
        if(str == null ){
            throw new NumberFormatException("电话号不能为空");
        }else{
            if(str.length() != 11){
                throw new NumberFormatException("电话号必须是十一位。");
            }
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                    throw new NumberFormatException("电话号必须是数字。");
                }
            }
            if(str.charAt(0) != '1'){
                throw new NumberFormatException("电话号首位必须是1");
            }
            if(str.charAt(1) < '3' || str.charAt(1) > '9'){
                throw new NumberFormatException("电话号第二位必须是3到9之间。");
            }
            char[] ch = str.toCharArray();
            for(int i = 3; i <= 7; i++){
               ch[i] = '*';
            }
            System.out.println(ch);
        }
    }
}
