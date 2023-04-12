package com.ujiuye.homework;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        TreeSet<Integer> set = new TreeSet<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2 == 0 ? 0 : 1;//1代表排序可大可小，即升序和降序混合排序
                    }
                }
        );
        int rightBlue = ran.nextInt(16) + 1;
        for(int i = 0; i < 6; i++){
            set.add(ran.nextInt(33) + 1);
        }
        System.out.println(set + " " + rightBlue);
        TreeSet<Integer> khset = new TreeSet<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2 == 0 ? 0 : 1;
                    }
                }
        );
        System.out.println(khset);
        System.out.println("请输入红色：");
        for(int j = 0; j < 6; j++){
            int red = sc.nextInt();
            khset.add(red);
        }
        System.out.println("请输入要买的蓝色的号码：");
        int setBlue = sc.nextInt();
        System.out.println(khset + "  " + setBlue);
        Object[] obj = set.toArray();
        Object[] obj1 = khset.toArray();
        int count = 0;
        for(int i = 0; i < obj.length; i++){
            int i1 = (Integer)obj[i];
            int i2 = (Integer) obj1[i];
            if(i1 == i2){
                count++;
            }else {
               break;
            }
        }
        if(count == 6 && setBlue == rightBlue){
            System.out.println("恭喜你中了一等奖,有一百万的奖金");
        }else if(count >= 3 && count <= 5 && setBlue == rightBlue){
            System.out.println("恭喜你中了二等奖,有50万的奖金");
        }else if(count == 1 && setBlue == rightBlue){
            System.out.println("恭喜你中了三等奖,有20万的奖金");
        }else {
            System.out.println("很遗憾您没有中奖，欢迎下次光临");
        }

    }
}
