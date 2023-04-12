package com.ujiye.homework;

public class KeyBorder implements UsbInterface{
    @Override
    public void up() {
        System.out.println("我可以接键盘");
    }

    @Override
    public void down() {
        System.out.println("把键盘断开");
    }
}
