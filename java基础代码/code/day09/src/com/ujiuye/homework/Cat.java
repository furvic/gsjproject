package com.ujiuye.homework;

public class Cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.println( getAge() + "的猫猫的毛毛颜色是" + getColor() + "他爱吃" + something  );
    }
    public void catchMouse(){
        System.out.println("猫猫还可以抓老鼠");
    }
}
