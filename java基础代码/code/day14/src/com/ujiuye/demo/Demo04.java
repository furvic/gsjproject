package com.ujiuye.demo;

import java.io.FileNotFoundException;

public class Demo04 {
    public static void main(String[] args) {
        try{
            checkFile("abc.docx");
        }catch (FileNotFoundException f){
            System.out.println("文件找不到");
        }catch (Exception e){
            System.out.println("文件不匹配");
        }
        System.out.println("end");
    }
    public static void checkFile(String fileName) throws Exception, FileNotFoundException {
        if(fileName == null){
            throw new Exception("文件不存在");
        }
        if(!".abc.txt".equals(fileName)){
            throw new FileNotFoundException("文件找不到");
        }else{
            System.out.println("已经找到文件");
        }
    }
}
