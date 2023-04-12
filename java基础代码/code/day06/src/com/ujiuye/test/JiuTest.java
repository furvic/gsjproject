package com.ujiuye.test;

public class JiuTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        for(int i =9; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        for(int i =1; i <= 9;i++){
            for(int j=9; j >= 1;j--){
                if (i < j) {
                    System.out.print("       ");
                }else if(i * j == j){
                    System.out.println(j+"*"+i+"="+j*i+" ");
                }else{
                    System.out.print(j+"*"+i+"="+j*i+" ");
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        for(int i =9; i >= 1;i--){
            for(int j=9; j >= 1;j--){
                if (j > i) {
                    System.out.print("       ");
                }else if(i * j == j){
                    System.out.println(j+"*"+i+"="+j*i+" ");
                }else{
                    System.out.print(j+"*"+i+"="+j*i+" ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println();

    }
}

