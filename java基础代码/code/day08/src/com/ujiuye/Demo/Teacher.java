package com.ujiuye.Demo;

public class Teacher extends Person{
    public Teacher() {
        super();
        System.out.println("heiheiheiehieeiehhhhhhhhhhhhhh");
    }
    public Teacher(String name){
        super(name);
        System.out.println(super.getName());
    }
   

    public void teach(){
        System.out.println( super.getName()+"教书" + super.getAge());
    }
}
