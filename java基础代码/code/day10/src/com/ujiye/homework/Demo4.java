package com.ujiye.homework;

public class Demo4 {
    public static void main(String[] args) {
// 请编写程序, 打印出接口中的变量num, 随后调用method方法,打印结果为 : 我是method ; 此处需完善代码
        Inter in = new Inter(){
            public void method(){
                System.out.println("我是method。");
            }
        };
        System.out.println(Inter.num);
        in.method();
    }
}
