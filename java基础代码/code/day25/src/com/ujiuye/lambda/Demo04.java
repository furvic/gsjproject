package com.ujiuye.lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Demo04 {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> new Random().nextInt(51) + 30;
        System.out.println(testSupplier(5,sup));

        Supplier<Integer> sup1 = () -> {
            Random ran = new Random();
            int num = ran.nextInt(100) + 1;
            while (num % 2 != 0){
                num = ran.nextInt(100) + 1;
            }
            return num;
        };
        System.out.println(testSupplier(8,sup1));

    }

    public static ArrayList<Integer> testSupplier(Integer num, Supplier<Integer> sup){
        ArrayList<Integer> list = new ArrayList<>();

        if (num > 0) {
            for(int i = 1; i <= num; i++){
                list.add(sup.get());
            }
        } else {
            System.out.println("数不对");
        }
        return list;
    }
}
