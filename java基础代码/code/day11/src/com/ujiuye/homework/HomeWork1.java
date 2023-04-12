package com.ujiuye.homework;
import java.util.*;
public class HomeWork1 {
    public static void main(String[] args) {
        String rightName = "admin";
        String rightPassword = "adm123";
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i <= 3){
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pass = sc.nextLine();
            if(name.equals(rightName) && pass.equals(rightPassword)){
                System.out.println("登录成功！");
                break;
            }else if(!name.equals(rightName) || !pass.equals(rightPassword)){
                System.out.println("数据输入错误，您还有" + (3- i) + "次机会。");
            }
            i++;
        }
            if(i > 3){
                System.out.println("您已经没有机会了。欢迎下次光临。");
            }




    }
}
