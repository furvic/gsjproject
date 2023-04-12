package com.ujiye.homework;


public class Demo3 {

    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.method();

    }
}
class Outer {
    int num1 = 10;
    class Inner {
        int num = 20;
        public void method(){
            int num = 30;
            Inner in = new Inner();
            System.out.println( num +","+this.num  +","+ num1 );
        }
    }
}
