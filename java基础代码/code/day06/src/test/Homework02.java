package test;

import java.util.Arrays;

public class Homework02 {
    /*
		定义出一个char类型数组, 数组大小为5, 使用动态初始化的方式,
		给数组元素赋值 ‘a’,’b’,’c’,’d’,’e’ , 然后依次将数组中的元素获取到


	*/
    public static void main(String[] args) {

        char[] arr = new char[5];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));


    }
}
