package com.ujiuye.homework;
import javax.security.auth.login.FailedLoginException;
import java.util.*;
public class HomeWork03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码：");
        String num = sc.nextLine();
        char[] ch = num.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] < '0' || ch[i] > '9'){
                throw new NumberFormatException("电话号码必须是数字。");
            }else if(ch.length != 11){
                throw new NumberFormatException("电话号码长度必须是十一位。");
            }else if(ch[0] != '1'){
                throw new Exception("电话号码开头必须是1");
            }else if(ch[1] < '3' || ch[1] > '9'){
                throw new Exception("电话号码第二位必须是3到9之间");
            }/*else if(ch[i] >= '4' && ch[i] <= '7'){
                for(int j = 4; j < 8; j++){
                    String s = String.valueOf(ch);
                    String ss = s.replaceAll(s,"*");
                    ch = ss.toCharArray();
                }
            }*/
        }
        for(int i = 4; i < 8; i++){
            ch[i] = '*';
        }
        System.out.println(ch);
    }
}
