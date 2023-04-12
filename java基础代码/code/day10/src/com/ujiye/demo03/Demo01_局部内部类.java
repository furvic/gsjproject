package com.ujiye.demo03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo01_局部内部类 {
    public static void main(String[] args) {
        breath();
    }
    public static void breath(){
        int count = 57;
        class Fei{
            String color = "黑";
            public void smoke(){
                System.out.println("每天抽烟" + count + "次，颜色都变" +color+ "了。");
            }
        }
        Fei f = new Fei();
        f.smoke();
    }
}
