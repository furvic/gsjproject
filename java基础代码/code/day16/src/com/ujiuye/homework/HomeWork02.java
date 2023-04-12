package com.ujiuye.homework;
/*
        2. 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
        红色球从1—33中随机生成6个不重复的号码；蓝色球号码从1—16中随机生成1个；
        客户通过键盘录入购买的红色球6个(不重复)和蓝色球1个, 判断客户的中奖状况:


 */
import netscape.security.UserTarget;

import java.util.*;
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int[] setRed = new int[6];
        int[] rightRed = new int[6];
        boolean flag = true;
        int rightBlue = ran.nextInt(16) + 1;
        for(int i = 0; i < 6; i++){
            int right = ran.nextInt(33) + 1;
            for(int j = 0; j < i; j++){
                if(rightRed[i] == rightRed[j]){
                    flag = false;
                    i--;
                    break;
                }
            }
            if(flag){
                rightRed[i] = right;
            }
        }
        System.out.println(Arrays.toString(rightRed) + "  " + rightBlue);
        System.out.println("请输入要买的红色的号码：");
        boolean flag1 = true;
        for(int i = 0; i < 6; i++){
                    int set = sc.nextInt();
                    for (int j = 0; j < i; j++) {
                        if(setRed[i] == setRed[j]){
                            flag1 = false;
                            i--;
                            break;
                        }
                    }
                    if(flag1){
                        setRed[i] = set;
                    }
        }
        System.out.println("请输入要买的蓝色的号码：");
        int setBlue = sc.nextInt();
        if (setBlue < 1 || setBlue > 16){
            System.out.println("蓝色球的范围只能是1到16之间");
        }
        System.out.println(Arrays.toString(setRed) + "  " + setBlue);

        getRedBall(setRed,rightRed,setBlue,rightBlue);

    }
    /*
            1) 买中蓝色球, 红色球全部买中, 1等奖 100万
          2) 买中蓝色球,红色球买中3-5个, 2等奖50万
          3) 买中蓝色球, 红色球买中1个, 3等奖20万
          4) 其余情况全部算作没有中奖
          要求 : 比较买中的红球时, 要求购买顺序也作为比较依据,购买顺序完全一致才算作买中红球个数,
        若有某个红色求没有买中, 后面红球无需再比较
     */
    public static void getRedBall(int[] rightRed,int[] setRed,int setBlue, int rightBlue){
        if(rightRed != null || rightRed.length > 0 || setRed != null || setRed.length > 0 ){
            int count = 0;
            for(int i = 0; i < rightRed.length; i++) {
                for (int j = 0; j < setRed.length; j++) {
                    if (rightRed[i] == setRed[j] && i == j) {
                        count++;
                    }
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
        }else{
            System.out.println("数值输入有误");
        }
    }
}
