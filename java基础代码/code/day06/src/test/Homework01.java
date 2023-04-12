package test;
import java.util.*;
class Homework01 {
    /*
        分析以下需求，并用代码实现：
        随机点名器
        即在全班同学中(共10人)随机的打印出一名同学名字
        要做的随机点名器，它具备以下3个内容：
                1. 自己定义10个学生的名字,并将同学姓名存储到数组中
                2. 遍历全班同学的姓名,将每位学生姓名打印在控制台上
                3. 在10人中,随机点名某一个同学,将被点名同学姓名打印到控制台上
    */
    public static void main(String[] args) {

        String s = getName();
        System.out.println(s);
    }
    public static String getName(){
        String[] arr = {"张三, ","李四, ","王五, ","钱六, ","豆豆, ","二丫, ","石头, ","狗蛋, ","洋洋, ","嘻嘻, "};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        Random ran = new Random();
        int index = ran.nextInt(arr.length);
        return arr[index];
    }
}
