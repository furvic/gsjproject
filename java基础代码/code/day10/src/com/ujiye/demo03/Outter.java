package com.ujiye.demo03;

public class Outter {

    private int i = 38;
    class Innter{
        String color = "红色";
        public void show(){
            System.out.println("心脏的颜色是" + color + "它的心跳是" + i);
        }
    }
    public void useInnter(){
        Innter in = new Innter();
        in.show();
    }
}
