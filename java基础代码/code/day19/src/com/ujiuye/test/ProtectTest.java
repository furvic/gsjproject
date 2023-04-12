package com.ujiuye.test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class ProtectTest {
    public static void main(String[] args) throws IOException {
        String s ;
        BufferedReader br = new BufferedReader(
                new FileReader("product.txt")
        );
        HashSet<Product> set = new HashSet<>();
        while((s = br.readLine()) != null){
            String[] ss = s.split("\\|");
            Product p = new Product(ss[0],ss[1],Double.parseDouble(ss[2]),Integer.parseInt(ss[3]),ss[4],ss[5]);
            set.add(p);
        }
        for(Product p1 : set){
            System.out.println(p1);
        }
        br.close();

    }
}
