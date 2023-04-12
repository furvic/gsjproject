package com.ujiuye.homework;
import java.util.*;
/*
获取两个字符串中最大相同子串，比如：
str1 = "dsgdsksdlghsd",str2 = "sdgdjfdsksdlgewqry";
 */
public class Test {
    public static void main(String[] args) {
        String str = "dsgdsksdlghsd";
        String str1 = "sdgdjfdsksdlgewqry";
        Test t = new Test();
        String s = t.getMax(str,str1);
        System.out.println(s);

    }
    public List<String> getMaxEqualsString(String str,String str1){
        String min = str.length() > str1.length() ? str1 : str;
        String max = str.length() > str1.length() ? str : str1;
        List<String> list= new ArrayList<>();
        for(int i = 0; i < min.length(); i++){//遍历小段字符串
            for(int j = 0, z = min.length() - i; z < min.length(); j++,z++){//z表示截取字符串从整个字符串依次递减到零的个数
                String s = min.substring(j,z);//j表示从第几位截取，z表示截取几个数，必须小于整个字符串
                if(max.contains(s)){//min.length() - i表示从第i个字符之后开始算截取的位数，i 与j同步进行遍历
                    list.add(s);//j再次遍历的目的是为了保证小字符串的长度不变，以防报出界异常
                }
            }
        }
        return list;
    }
    public String getMax(String s1, String s2){
        List<String> list = getMaxEqualsString(s1,s2);
        String max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).length() > list.get(0).length()){
                max = list.get(i);
            }
        }
        return max;
    }
}
