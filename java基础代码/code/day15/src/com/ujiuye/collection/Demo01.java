package com.ujiuye.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("sd");
        c.add("dsaf");
        c.add(2243);
        c.add("中国");
        System.out.println(c);
        c.remove("sd");
        System.out.println(c);
        boolean b = c.contains(2243);
        System.out.println(b);
        boolean bo = c.isEmpty();
        System.out.println(bo);
        System.out.println(c.size());
        Collection c1 = new ArrayList();
        c1.add(32);
        c1.add(2243);
        //c1.add(46);
        c1.add("中国");
        Object[] obj = c1.toArray();
        System.out.println(obj);
       /* for(int i = 0; i < obj.length; i++){
            Integer in = (Integer)obj[i];
            System.out.println(in + 1);
        }*/
        //c.clear();
        System.out.println(c.isEmpty());
        c.addAll(c1);
        System.out.println(c);
        Collection c2 = new ArrayList();
        c2.add(32);
        c2.add(23);
        c.removeAll(c2);
        System.out.println(c);
        System.out.println(c.containsAll(c1));
        c1.retainAll(c);
        System.out.println(c1);

    }
}
