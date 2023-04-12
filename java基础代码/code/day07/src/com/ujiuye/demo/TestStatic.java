package com.ujiuye.demo;

public class TestStatic {

        public static void main(String[] args) {
            Foo f1 = new Foo();//0
            Foo f2 = new Foo();//1
            Foo f3 = new Foo();//2
            System.out.println(f1.id + "---" + f2.id + "---" + f3.id + "----" + Foo.i);//3
        }
    }

    class Foo{
        int id;
        static int i = 0;
        public Foo() {
            id = i++;
        }
    }

