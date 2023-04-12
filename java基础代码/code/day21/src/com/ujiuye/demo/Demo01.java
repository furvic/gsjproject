package com.ujiuye.demo;

public class Demo01 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();
        for (int i= 1; i <= 10; i++){
            System.out.println("main---" + i);
        }
        new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= 10; i++){
                    System.out.println("匿名----" + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                for(int i = 1; i <= 10; i++){
                    System.out.println("匿名2----" + i);
                }
            }
        }.start();

    }
  // 3. main方法本身就是一条线程. 名字叫做: main
 /* public static void main(String[] args) {
      // 4. 创建出一条独立线程
      MyThread my = new MyThread();
      // 5. 调用从父类Thread中继承来的strart方法 : 开启线程通道,运行的就是当前线程MyThread中的run方法
      my.start();

      // 6. 在main方法中设计出一个循环
      for(int i = 1; i <= 100; i++){
          System.out.println("main---" + i);
      }
  }*/
}
