package com.ujiuye.demo;

public class SingletonLay {
    private SingletonLay (){}

    private static SingletonLay sl;
    public static SingletonLay getInstance(){
        if(sl == null){
            synchronized ("anc"){
                if(sl == null){
                    sl = new SingletonLay();
                }
            }
        }
        return sl;
    }
}
