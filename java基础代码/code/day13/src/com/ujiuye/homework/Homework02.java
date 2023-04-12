package com.ujiuye.homework;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Homework02 {
        /*
        2.分析以下需求，并用代码实现：
            (1)通过键盘录入日期字符串，格式(2015-10-20)
            (2)输出该日期是星期几及这一年的第几天
            (3)如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第293 天"
        */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期：");
        //设置日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //输入日期
        String date = sc.nextLine();
        Calendar cal = Calendar.getInstance();
        //将输入的字符串转为date格式
        Date d1 = sdf.parse(date);
        //输出规定的日期格式
        String s = sdf.format(d1);
        //将date格式的日期转为calend格式
        cal.setTime(d1);
        //得出所输的年，日，星期
        int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int day = cal.get(Calendar.DAY_OF_YEAR);
        int year = cal.get(Calendar.YEAR);
        System.out.println(s + "是" + "星期" + week + "是" + year + "年的第" + day + "天");

    }
}
