package com.ujiuye.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Runnable run1 = new Runnable(){
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };
        Runnable run2 = new Runnable(){
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };
        Runnable run3 = new Runnable(){
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };
        Runnable run4 = new Runnable(){
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };
        Runnable run5 = new Runnable(){
            @Override
            public void run() {

                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };
        Runnable run6 = new Runnable(){
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };
        Runnable run7 = new Runnable(){
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + "~~~~~~~~~" + i);
                }
            }
        };

        es.submit(run1);
        es.submit(run2);
        es.submit(run3);
        es.submit(run4);
        es.submit(run5);
        es.submit(run6);
        es.submit(run7);

        //es.shutdown();
        es.shutdownNow();
    }
}
