package com.ujiuye.singleton;

public class Singleton {
    private Singleton(){}
    private static Singleton sh = new Singleton();
    public static Singleton getInstance(){
        return sh;
    }
}
