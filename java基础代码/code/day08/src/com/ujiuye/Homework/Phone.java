package com.ujiuye.Homework;

public class Phone {
    private String brand ;
    private double price;
    public static final int SIZE = 6;
    public void call(){
        System.out.println("给我打电话");
    }
    public void sendMessage(){
        System.out.println("给我发短信");
    }
    public void playGame(){
        System.out.println("一起玩游戏吧");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
