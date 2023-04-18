package test;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {
        int timeSize = 100000;
        int maxSize = 100;
        int maxValue = 100;
        boolean success = true;
        for (int i = 0; i < timeSize; i++) {
            int[] arr1 = generatorRandomArr(maxSize, maxValue);
            int[] arr2 = copyArr(arr1);
            bubbleSourt(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                success = false;
                break;
            }

        }
        System.out.println(success ? "Nice" : "Fuck");

        int[] arr = generatorRandomArr(maxSize, maxValue);
        printArr(arr);
        bubbleSourt(arr);
        printArr(arr);

    }

    public static void bubbleSourt(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];//arr[i]=a  arr[j]=b
        arr[j] = arr[i] ^ arr[j];//arr[j]=arr[i] ^ arr[j]^ arr[j]= a ^ b ^ b=a
        arr[i] = arr[i] ^ arr[j];//arr[i]=arr[i] ^ arr[j]^ arr[j]=a^b^a


    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generatorRandomArr(int maxSize, int maxValue) {

        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;

    }

    public static int[] copyArr(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


}
