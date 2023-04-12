package com.ujiuye.homeworj;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork01 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("宫本武藏");
        list1.add("宋公明");
        list1.add("苏有朋");
        list1.add("石头人");
        list1.add("时传祥");
        list1.add("李耳");
        list1.add("庄子");
        list1.add("洪七公");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("帕瓦罗蒂");
        list2.add("张三丰");
        list2.add("赵伟伟");
        list2.add("张自忠");
        list2.add("孛儿只斤铁木真");
        list2.add("张天爱");
        list2.add("刘义云");
        list2.add("宋茜");
        Stream<String> str = list1.stream();
        //Stream<String> str1 = str.filter(x -> x.length() == 3).limit(3);
       // str1.forEach(x -> System.out.println(x));
        System.out.println();

        Stream<String> str2 = list2.stream();
        //Stream<String> str3 = str2.filter(x -> x.contains("张")).skip(2);
        //str3.forEach(x -> System.out.println(x));

       /* Object[] str4 = str3.toArray();
        for(int i = 0; i< str4.length ; i++){
            if(i < 2){
                continue;
            }
            System.out.println(str4[i]);
        }*/

        Stream<String> str5 = Stream.concat(str,str2);
        Stream<Person> str6 = str5.map(Person::new);
        List<Object> li = str6.collect(Collectors.toList());
        //Set<String> set = li.stream().map(Person::getName).collect();
        System.out.println(li);
        /*Person per = (Person)str5;
        ArrayList<Person> list = new ArrayList<>();
        Object[] obj = str5.toArray();
        for(Object o : obj){
             per = (Person)o;
            list.add(per);
        }
        System.out.println(list);*/






    }
}
