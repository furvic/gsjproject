package com.company;

/**
 * 打印整数的32位信息
 */
public class Count {

    public static void main(String[] args) {

        int num = 4;
        print(num);
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

}
