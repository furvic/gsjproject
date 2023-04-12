package com.ujiuye.homework;

import java.util.*;

public class HomeWork02 {
    public static void main(String[] args) {
       /* String[] str = {"大王","小王","黑桃A","红桃A","方块A","梅花A",
                "黑桃2","红桃2","方块2","梅花2","黑桃3","红桃3","方块3","梅花3",
                "黑桃4","红桃4","方块4","梅花4","黑桃5","红桃5","方块5","梅花5",
                "黑桃6","红桃6","方块6","梅花6","黑桃7","红桃7","方块7","梅花7",
                "黑桃8","红桃8","方块8","梅花8","黑桃9","红桃9","方块9","梅花9",
                "黑桃10","红桃10","方块10","梅花10","黑桃J","红桃J","方块J","梅花J",
                "黑桃Q","红桃Q","方块Q","梅花Q","黑桃K","红桃K","方块K","梅花K"};*/
        String[] color = {"黑桃","红桃","方块","梅花"};
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        ArrayList<Integer> paiIndex = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();
        int index = 2;
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < color.length; j++){
                    String zhipai = num[i] + color[j];
                    map.put(index,zhipai);
                    paiIndex.add(index);
                    index++;
            }
        }
        map.put(0,"大王");
        map.put(1,"小王");
        paiIndex.add(0);
        paiIndex.add(1);

       /* List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            list.add(str[i]);
        }*/
        //System.out.println(list);
        Collections.shuffle(paiIndex);
        List<Integer> list1 = new ArrayList<>();//每个玩家都是一个集合
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();//底牌设置成一个集合
        for(int i = 0; i < paiIndex.size(); i++){
            Integer in = paiIndex.get(i);
            if(i >= 51){
                dipai.add(in);
            }else if(i % 3 == 0){
                list1.add(in);
            }else if(i % 3 ==1){
                list2.add(in);
            }else{
                list3.add(in);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(dipai);
        /*for(Integer key : list1){
            String value = map.get(key);
            System.out.print(  value + " ");
        }
        System.out.println();
        for(Integer key : list2){
            String value = map.get(key);
            System.out.print(  value + " ");
        }
        System.out.println();
        for(Integer key : list3){
            String value = map.get(key);
            System.out.print( value + " ");
        }
        System.out.println();
        for(Integer key : dipai){
            String value = map.get(key);
            System.out.print( value + " ");
        }*/
        System.out.println();
        /*System.out.println("玩家1：" + map);
        System.out.println("玩家2：" + map);
        System.out.println("玩家3：" + map);
        System.out.println("底牌：" + map);*/
        getPai("玩家1",list1,map);
        getPai("玩家2",list2,map);
        getPai("玩家3",list3,map);
        getPai("底牌",dipai,map);

    }
    public static void getPai(String name,List<Integer> list, Map<Integer,String> map){
        System.out.println(name + ":");
        for(Integer key : list){
            String value = map.get(key);
            System.out.print( value + " ");
        }
        System.out.println();
    }
}
