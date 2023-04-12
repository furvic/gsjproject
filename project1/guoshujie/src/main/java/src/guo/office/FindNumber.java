package src.guo.office;

public class FindNumber {


    public static void main(String[] args) {
        int [] array = {4,3,5,6,2,9,1};
        int[] result = findLostNum(array);
        System.out.println(result[0]+","+result[1]);
    }

    public static int[] findLostNum(int[] array){
        //用于存储2个出现奇数次的整数
        int result[] = new int[2];
        //第1次进行整体异或运算
        int xorResult = 0;
        for (int i = 0; i < array.length; i++) {
            xorResult^=array[i];
        }
        //如果进行异或运算的结果为0，则说明输入的数组不符合题目要求
        if (xorResult==0){
            return null;
        }
        //确定2个整数的不同位，以此来分组
        int separator = 1;
        while (0==(xorResult&separator)){
            separator<<=1;
        }
        //第2次分组进行异或运算
        for (int i = 0; i < array.length; i++) {
            if (0==(array[i]&separator)){
                result[0]^=array[i];
            }else {
                result[1]^=array[i];
            }
        }
        return result;
    }
}
