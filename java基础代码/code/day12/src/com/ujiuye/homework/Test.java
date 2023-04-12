package com.ujiuye.homework;
import java.util.Arrays;
import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入数组大小");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        System.out.println("请录入若干整数");
        String string;
        int count = 0;
        while(count < length){
            string = scanner.nextLine();
            if(string.equals("end"))
                break;
            arr[count++] = Integer.parseInt(string);
        }
        scanner.close();
        System.out.println(Arrays.toString(arr));
    }
}
