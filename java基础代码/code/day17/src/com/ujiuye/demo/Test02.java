package com.ujiuye.demo;

public class Test02 {
    public static void main(String[] args) {
        getSum(1,23,45,54,7,86,8,97);
        getArea(1,23,45,54,7,86,8,97);
    }
    public static int getSum(int ... x){
        int sum = 0;
        for(int i : x){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
    public static int getArea(int ... y){
        int area = 1;
        for(int i : y){
            area *= i;
        }
        System.out.println(area);
        return area;
    }
    public static int getI(int i, int ...j){
        return 0;
    }
}
