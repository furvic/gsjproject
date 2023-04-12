package com.ujiuye.demo;

public class Demo02 {
    int x = 20;
    public void useX(){
        int x = 10;
        System.out.println(this.x);
        System.out.println(x);
        System.out.println(this+"************");
    }

    public static void main(String[] args) {
        Demo02 d = new Demo02();
        System.out.println(d + "&&&&&&&&&&&&&&&&&&&");
        d.useX();

    }
}
