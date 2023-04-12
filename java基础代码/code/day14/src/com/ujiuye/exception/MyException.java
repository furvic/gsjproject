package com.ujiuye.exception;

public class MyException extends Exception{
    public MyException(){}
    public MyException(String message){
        super(message);
    }
    public void checkAge(int age){
        if(age >= 200 || age < 0){
            System.out.println( age + "不符合条件");
        }
    }
}
