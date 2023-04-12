package com.ujiuye.homework;

public class Singleton {
    private Singleton(){}
    private static Singleton sh = null;
    public static Singleton getInstance(){
        if(sh == null){
            sh = new Singleton();
        }
        return sh;
    }
}
