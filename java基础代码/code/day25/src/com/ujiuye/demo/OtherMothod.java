package com.ujiuye.demo;

public interface OtherMothod {
    int I = 1;

    void run();

    default void eat(){
        System.out.println("要吃饭吗鹅鹅鹅鹅鹅鹅鹅鹅鹅鹅鹅鹅");
    }
    default void sleep(){
        System.out.println("睡觉了哈哈哈哈哈哈哈哈哈哈哈哈哈");
    }
}
