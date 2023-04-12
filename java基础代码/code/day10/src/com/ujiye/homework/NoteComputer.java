package com.ujiye.homework;

public class NoteComputer {
    public void open(){
        System.out.println("我可以开机");
    }
    public void close(){
        System.out.println("我还可以关机");
    }
    public UsbInterface useUSB(UsbInterface usb){
        System.out.println("我还能使用USB接口");
        usb.up();
        usb.down();
        return usb;
    }

}
