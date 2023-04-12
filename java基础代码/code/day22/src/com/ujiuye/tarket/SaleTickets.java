package com.ujiuye.tarket;

public class SaleTickets implements Runnable{
    static int tickets = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (tickets > 0) {
            sale1();
        }
    }
    public synchronized void sale(){
        //synchronized (this) {
            if (tickets > 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖的第" + tickets-- + "次票。");
            }
        //}
    }
    public static synchronized void sale1(){
        //synchronized (SaleTickets.class) {
        if (tickets > 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖的第" + tickets-- + "次票。");
        }
       //}
    }
}
