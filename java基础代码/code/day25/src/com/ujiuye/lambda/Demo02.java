package com.ujiuye.lambda;

public class Demo02 {
    public static void main(String[] args) {
        MyInter5 my5 = i -> {
            for(int j = 0; j <= i; j++){
                System.out.println(j);
            }
        };
        my5.print(3);
        System.out.println("-------------------------");
        MyInter5 my55 = new Print1() :: print1;
        my55.print(4);
        System.out.println("-------------------------");
        MyInter5 my555 = Print2 :: print2;
        my555.print(6);
        System.out.println("-------------------------");
    }
}

@FunctionalInterface
interface MyInter5{
    public abstract void print(int i);
}

class Print1{

    public void print1(int i){
        for(int j = 0; j <= i; j++){
            System.out.println(j);
        }
    }
}
class Print2{

    public static void print2(int i){
        for(int j = 0; j <= i; j++){
            System.out.println(j);
        }
    }
}