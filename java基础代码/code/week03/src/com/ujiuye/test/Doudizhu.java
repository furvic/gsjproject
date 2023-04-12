package com.ujiuye.test;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Doudizhu {
    public static void main(String[] args) {
        String[] color = {"黑桃","红桃","方块","梅花"};
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        ArrayList<Integer> paiIndex = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"大王");
        paiIndex.add(0);
        map.put(1,"小王");
        paiIndex.add(1);
        //创建索引
        int index = 2;
        for(String number : num){
            for(String col : color){
                String zhipai = number + col;
                map.put(index,zhipai);
                paiIndex.add(index);
                index++;
            }
        }
        Collections.shuffle(paiIndex);
        //用索引位置代表玩家抽到的纸牌，对应map集合中的key值
        ArrayList<Integer> list1 =  new ArrayList<>();
        ArrayList<Integer> list2 =  new ArrayList<>();
        ArrayList<Integer> list3 =  new ArrayList<>();
        ArrayList<Integer> dipai=  new ArrayList<>();
        for(int i = 0; i < paiIndex.size(); i++){
            Integer c = paiIndex.get(i);
            if(i >= 51){
                dipai.add(c);
            }else if(i % 3 == 0){
                list1.add(c);
            }else if(i % 3 == 1){
                list2.add(c);
            }else{
                list3.add(c);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(dipai);
        getPai("玩家1",list1,map);
        getPai("玩家2",list2,map);
        getPai("玩家3",list3,map);
        getPai("底牌",dipai,map);

    }

    public static void getPai(String name,ArrayList<Integer> list,Map<Integer,String> map){
        System.out.print(name + ":");
        for(Integer i : list){
            String value = map.get(i);
            System.out.print(value + " ");
        }
        System.out.println();
    }


}
