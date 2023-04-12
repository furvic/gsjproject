package com.ujiuye.demo;

public class Demo05 {
    public static void main(String[] args) {
        user();
        try{
            int i = 10 / 0;
            System.out.println(i);
        }finally {
            System.out.println("我要执行");
        }
    }
    public static void user(){
        try{
            int i = 10 / 1;
            System.out.println(i);
            //System.exit(0);//系统停止
        }catch (Exception e){
            System.out.println("异常处理成功");
        }finally {
            System.out.println("我一定要执行");
        }
    }
}
