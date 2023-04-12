package com.ujiuye.collection;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");c.add("b");
        c.add("c");
        c.add("d");
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object ob = it.next();
            String s = (String) ob;
            System.out.println(s);
        }
        for(Object o : c){
            String s = (String)o;
            System.out.println(s);
        }

    }

}
