package src.guo.office;

import javax.smartcardio.ATR;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Algorithm1 {

    public static void main(String[] args) {
        double[] array = new double[]{4.12, 5.34, 6.43, 7.43, 3.45, 2.75};
        double[] sortArray = bucketSort(array);
        System.out.println(Arrays.toString(sortArray));
        int[] arr = new int[]{98,97,96,94,99,98};
        System.out.println(Arrays.toString(countSort(arr)));
    }


    public static int[] countSort(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int d = max - min;
        int[] countArray = new int[d + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] sortArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortArray[countArray[array[i]-min]-1] = array[i];
            countArray[array[i]-min]--;
        }
        return sortArray;
    }

    public static double[] bucketSort(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        double d = max - min;
        int bucketNum = array.length;
        ArrayList<LinkedList<Double>> bucketList = new ArrayList<LinkedList<Double>>(bucketNum);
        for (int i = 0; i < bucketNum; i++) {
            bucketList.add(new LinkedList<Double>());
        }
        for (int i = 0; i < array.length; i++) {
            int num = (int) ((array[i] - min) * (bucketNum - 1) / d);//区间跨度 = （最大值-最小值）/ （桶的数量-1）
            bucketList.get(num).add(array[i]);
        }
        for (int i = 0; i < bucketList.size(); i++) {
            Collections.sort(bucketList.get(i));
        }
        double[] sortedArray = new double[array.length];
        int index = 0;
        for (LinkedList<Double> list : bucketList) {
            for (Double doublr : list) {
                sortedArray[index] = doublr;
                index++;
            }
        }
        return sortedArray;
    }
}
