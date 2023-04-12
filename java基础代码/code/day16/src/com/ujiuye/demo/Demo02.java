package com.ujiuye.demo;

public class Demo02 {
    public static void main(String[] args) {
        FanXingClass<Integer> list = new FanXingClass<>();
        list.addEle(432);
        list.addEle(2);
        System.out.println(list.list);

        String[] s = {"sdf","45","sfg"};
        FanXingMethod.changeArrayzEle(s,1,2);
        Integer[] arr = {24,56,34,43};
        FanXingMethod.changeArrayzEle(arr,1,2);
    }
}
