package com.ujiuye.tarket;

import java.io.ObjectInputStream;

public class SaleTickets implements Runnable{
    int tickets = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (tickets > 0) {
            synchronized (obj){
                if (tickets > 0 ) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖的第" + tickets-- + "次票。");
                }
            }
        }

    }
}
