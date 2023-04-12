package com.ujiye.homework;

public class Mouse implements UsbInterface{

    @Override
    public void up() {
        System.out.println("我可以接鼠标");
    }

    @Override
    public void down() {
        System.out.println("把鼠标断开");
    }
}
