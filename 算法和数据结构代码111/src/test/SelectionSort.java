package test;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int timeSize = 100000;
        int maxSize = 100;
        int maxValue = 100;
        boolean success = true;
        for (int i = 0; i < timeSize; i++) {
            int[] arr1 = generateRandomArr(maxSize, maxValue);
            int[] arr2 = copyArr(arr1);
            selectSort(arr1);
            comparator(arr2);
            if (!IsEqual(arr1, arr2)) {
                success = false;
//                printArr(arr1);
//                printArr(arr2);
                break;
            }
        }
        System.out.println(success ? "Nice!" : "Fuck！");

        int[] ar = generateRandomArr(maxSize, maxValue);
        printArr(ar);
        selectSort(ar);
        printArr(ar);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;

            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }


    public static int[] generateRandomArr(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxSize * Math.random());
        }
        return arr;

    }

    public static boolean IsEqual(int[] arr1, int[] arr2) {
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


    public static int[] copyArr(int[] arr) {
        if (arr == null || arr.length < 0) {
            return null;
        }

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }


}
