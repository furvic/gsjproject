package com.ujiuye.exception;

public class Demo01 {
    public static void main(String[] args) {
        int age = 30;
        try{
            if(age >= 0 && age < 200){
                System.out.println(age);
            }
            if(age < 0){
                throw new MyException("不符合年龄条件");
            }
        }catch (MyException ex){
            ex.printStackTrace();
            ex.checkAge(age);
        }

    }
}
