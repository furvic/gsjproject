package com.ujiuye.homework;

import java.util.ArrayList;
import java.util.Random;

public class Luck implements Runnable{
    Random ran = new Random();
    int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
    ArrayList<Integer> set = new ArrayList<>();
    @Override
    public void run() {
          while (arr != null && arr.length > 0) {
              synchronized ("abc") {
                  if (arr != null && arr.length > 0) {
                      for (int i = 0; i < arr.length; i++) {
                            int index = ran.nextInt(arr.length);
                            if(!(set.contains(index))){
                              set.add(index);
                              try {
                                  Thread.sleep(200);
                              } catch (InterruptedException e) {
                                  e.printStackTrace();
                              }
                              System.out.println(Thread.currentThread().getName() + "又产生了一个" + arr[index] + "元大奖。");
                          }
                      }

                     /* for(int i = 0; i < set.size(); i++){
                          int index = ran.nextInt(arr.length);
                          if(set.contains(index)){
                              set.remove(index);
                              System.out.println(arr[index] + "被删除了");
                          }
                          if(set.size() <= 0){
                                break;
                          }

                      }*/
                      if(arr.length == set.size()){
                            break;
                      }
                  }
              }
          }
    }
}
