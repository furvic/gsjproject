package com.ujiuye.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        new MyInter1(){
            @Override
            public void fun() {
                System.out.println("匿名匿名");
            }
        }.fun();

        MyInter1 my = () -> {
            System.out.println("Lambda");
        };
        my.fun();

        MyInter2 my2 = (x) -> {
            System.out.println("正在吃" + x);
        };
        my2.eat("汉堡");
        MyInter2 my22 = y -> { System.out.println("正在吃" + y); };
        my22.eat("满汉全席");

        MyInter3 my3 = (a , b) ->{ System.out.println(a + b); };
        my3.getSum(4,8);

        MyInter4 my4 = (x,y) -> { return x == y; };
        System.out.println(my4.equals(3.24,6.32));

        MyInter4 my44 = (x,y) -> x == y;
        System.out.println(my44.equals(3.24,3.24));





    }
}
@FunctionalInterface
interface MyInter1{
    public abstract void fun();
}
@FunctionalInterface
interface MyInter2{
    public abstract void eat(String something);
}
@FunctionalInterface
interface MyInter3{
    public abstract void getSum(int x, int y);
}
@FunctionalInterface
interface MyInter4{
    public abstract boolean equals(double x, double y);
}
