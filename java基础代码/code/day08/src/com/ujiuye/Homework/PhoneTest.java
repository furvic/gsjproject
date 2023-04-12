package com.ujiuye.Homework;

public class PhoneTest {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.playGame();
        sp.sendMessage();
       sp.setBrand("华为");
       sp.setPrice(1999.99);
        System.out.println(sp.getBrand() + "手机的价格是" + sp.getPrice() + "元，它的屏幕尺寸是" + SmartPhone.SIZE);
    }


}
