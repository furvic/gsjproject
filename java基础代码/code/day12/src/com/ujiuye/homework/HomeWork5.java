package com.ujiuye.homework;

public class HomeWork5 {
    public static void main(String[] args) {
        int m, g, z;
        int n = 0;
        for( m = 1; m <= 20; m++){
            for( g = 1; g <= 33; g++){
                 z = 100 - m - g;
                if((m * 3) + (g * 5) + (z * (1 / 3)) == 100){
                    System.out.println("第"+ n +"种方式，可以买" + m + "只公鸡，" + g + "只母鸡， " + z + "只小鸡。");
                    n++;
                }
            }
        }

        System.out.println("一共有" + n + "种购买方式。");
    }
}
