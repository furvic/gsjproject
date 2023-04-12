package com.ujiuye.demo;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        checkFile("cba.txt");
    }
    public static void checkFile(String fileName) throws Exception,FileNotFoundException {
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
