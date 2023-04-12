package com.ujiuye.homework;

import java.io.*;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\工具\\Java1.28\\笔记");
        File f1 = new File("D:\\copy");
        BufferedReader br = null;
        BufferedWriter bw = null;
        if(f.isDirectory()){
            File[] ff = f.listFiles();
            for(File file : ff){
                br = new BufferedReader(
                        new FileReader(file)
                );
                //System.out.println(file.getName());
                String name = file.getName();
                if(name.endsWith(".txt")){
                    String[] strs = name.split("\\.");
                    String start = strs[0] + ".txt";
                    File f2 = new File(f1,start);
                    bw = new BufferedWriter(
                            new FileWriter(f2)
                    );
                    String str;
                    while ((str = br.readLine())!= null){
                        bw.write(str);
                        bw.newLine();
                    }
                }
                System.out.println(file.getName());
            }
        }else{
            System.out.println("不是文件夹");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
