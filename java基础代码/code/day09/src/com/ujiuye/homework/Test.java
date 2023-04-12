package com.ujiuye.homework;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"A","D","B","C","D"};
        String[][] arr1 = {{"D","C","B","A","D"},
                           {"A","D","B","C","D"},
                           {"A","D","B","C","A"},
                           {"A","B","C","D","D"}};
        Test a = new Test();
        a.equalArray(arr,"小中",arr1);
        a.equalArray(arr,"小公",arr1);
        a.equalArray(arr,"小教",arr1);
        a.equalArray(arr,"小育",arr1);



    }
    public void equalArray(String[] arr,String name, String[][] arr1) {
        int sorce = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr1.length -i ; j++) {
                if (arr[i].equals(arr1[i][j])) {
                    sorce += 2;
                }
            }
        }
        System.out.println("满分10分，" + name + ": 得分：" + sorce + "分。");
    }
}
