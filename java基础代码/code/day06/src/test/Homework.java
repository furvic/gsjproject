package test;

public class Homework {
    public static void main(String[] args) {
        int i = getAvg();
        System.out.println("平均值为：" + i );

    }
    public static int getAvg(){
        int[] arr = {95,92,75,56,98,71,80,58,91,91};
        int sum = 0;
        int avg = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum /= arr.length ;
        for(int i = 0; i < arr.length; i++){
            if(avg < arr[i]){
                count++;
            }
        }
        System.out.println("高于平均数的有" +count+ "个。");
        return avg;
    }
}
