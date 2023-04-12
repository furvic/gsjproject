package com.ujiuye.lambda;

import java.beans.Customizer;
import java.util.function.Consumer;

public class Demo03 {
    public static void main(String[] args) {

        Consumer<Double> con = x -> System.out.println("花了" + x + "元,.买了一把大宝剑.");
        testCustomer(533,con);

        Consumer<Double> con1 = x -> {
            if(x > 500){
                System.out.println("太贵了,钱不够");
            }else {
                System.out.println("花了" + x + "元,.买了一堆化妆品.");
            }
        };

        testCustomer(533,con1);
    }
    public static void testCustomer(double money , Consumer<Double> con){
        con.accept(money);
    }
}


