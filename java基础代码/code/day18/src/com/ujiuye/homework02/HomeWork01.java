package com.ujiuye.homework02;

import java.io.File;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\save");
        System.out.println(file.mkdir());
        System.out.println(new File("D:\\save\\1.txt").createNewFile());
        System.out.println(new File("D:\\save\\2.txt").createNewFile());
        System.out.println(new File("D:\\save\\1.docx").createNewFile());
        System.out.println(new File("D:\\save\\2.docx").createNewFile());
        System.out.println(new File("D:\\save\\3.docx").createNewFile());
        System.out.println(new File("D:\\save\\1.ppt").createNewFile());
        System.out.println(new File("D:\\save\\2.ppt").createNewFile());

    }
}
