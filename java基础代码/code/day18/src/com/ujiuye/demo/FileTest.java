package com.ujiuye.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\code\\day18");
        System.out.println(f);
        File f1 = new File("D:\\","code\\day18\\src");
        System.out.println(f1);
        File f2 = new File(f,"src");
        System.out.println(f2);
        System.out.println("----------------------------------------------------------");
        File f3 = new File("D:\\s.txt");
        boolean bo = f3.createNewFile();
        System.out.println(bo);
        File f4 = new File("D:\\ac.xls");
        System.out.println(f4.createNewFile());
        File f5 = new File("D:\\a");
        System.out.println(f5.mkdir());
        File f6 = new File("D:\\a\\sd\\dhf");
        File f7 = new File("D:\\a\\sd");
        System.out.println(f6.mkdirs());

        /*System.out.println(f3.delete());
        System.out.println(f4.delete());
        System.out.println(f6.delete());
        System.out.println(f7.delete());
        System.out.println(f5.delete());*/


        System.out.println(f.exists());
        System.out.println(f3.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        String s = f3.getAbsolutePath();
        System.out.println(s);
        String s1 = f6.getPath();
        System.out.println(s1);
        System.out.println(f4.getName());
        System.out.println();
        File f8 = new File("D:");
        String[] list = f8.list();
        System.out.println(Arrays.toString(list));
        File[] li = f8.listFiles();
        System.out.println(Arrays.toString(li));


    }
}
