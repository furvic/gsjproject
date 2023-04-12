package com.ujiuye.lock;

import java.util.concurrent.locks.ReentrantLock;

public class SaleTickets implements Runnable{
    int tickets = 100;
    ReentrantLock rt = new ReentrantLock();
    @Override
    public void run() {
        while (tickets > 0) {
                rt.lock();
                try {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在卖的第" + tickets-- + "次票。");
                    }
                }finally {
                    rt.unlock();
                }

        }

    }
}
