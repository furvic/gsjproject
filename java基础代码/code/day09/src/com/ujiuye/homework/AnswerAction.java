package com.ujiuye.homework;

public class AnswerAction {
    public static void main(String[] args) {
        String[] arr = {"A","D","B","C","D"};
        String[] arr1 = {"D","C","B","A","D"};
        String[] arr2 = {"A","D","B","C","D"};
        String[] arr3 = {"A","D","B","C","A"};
        String[] arr4 = {"A","B","C","D","D"};
        AnswerAction a = new AnswerAction();
        a.equalArray(arr,"小中",arr1);
        a.equalArray(arr,"小公",arr2);
        a.equalArray(arr,"小教",arr3);
        a.equalArray(arr,"小育",arr4);



    }
    public void equalArray(String[] arr,String name, String[] arr1){
        if (arr != null && arr1 != null && arr.length > 0 && arr1.length > 0) {
            int sorce = 0;
            for(int i = 0; i < arr.length; i++){

                if(arr[i].equals(arr1[i])){
                        sorce += 2;
                }
            }
            System.out.println("满分10分，" + name + ": 得分：" + sorce + "分。");
        } else {
            System.out.println("数组有误");
        }
    }
}
