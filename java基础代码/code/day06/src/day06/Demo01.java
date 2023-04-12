package day06;
/*

 */
public class Demo01 {

    public static void main(String[] args) {
        int[] arr = {21,435,547,768,74353,3646,657,8676,2,345};
        getArraysElement(arr);
        System.out.println("&****&*&*&***&*&(&&&&&&&&&*******&*&*&*&*&&^%%&*^%$^&");
        getMaxElement(arr);
        System.out.println("&****&*&*&***&*&(&&&&&&&&&*******&*&*&*&*&&^%%&*^%$^&");
        getMinElement(arr);
        System.out.println("&****&*&*&***&*&(&&&&&&&&&*******&*&*&*&*&&^%%&*^%$^&");
        reverseElement(arr);
        getArraysElement(arr);
        System.out.println("&****&*&*&***&*&(&&&&&&&&&*******&*&*&*&*&&^%%&*^%$^&");
        int a = findArray(arr,547);
        System.out.println(a);
        System.out.println("&****&*&*&***&*&(&&&&&&&&&*******&*&*&*&*&&^%%&*^%$^&");
        sortArray(arr);
        getArraysElement(arr);
        System.out.println("&****&*&*&***&*&(&&&&&&&&&*******&*&*&*&*&&^%%&*^%$^&");

    }
    public static void getArraysElement(int[] arr){
        if(arr != null && arr.length > 0){
            for(int index = 0; index < arr.length; index++){
                System.out.print(arr[index] + " ");

            }
            System.out.println();

        }else{
            //System.out.println();
            throw new RuntimeException("数组为null，无法进行操作");

        }
    }
    public static int getMaxElement(int[] arr){
        int max = arr[0];
            if(arr != null && arr.length >0){
            for(int index = 0; index < arr.length; index++){
                if(max < arr[index]){
                    max = arr[index] ;
                }
            }
            System.out.println(max);
        }else{
            System.out.println("数组为null，无法进行操作");
        }
        return max;
    }
    public static int getMinElement(int[] arr){
        int min = arr[0];
        if(arr != null && arr.length >0){
            for(int index = 0; index < arr.length; index++){
                if(min > arr[index]){
                    min = arr[index] ;
                }
            }
            System.out.println(min);
        }else{
            System.out.println("数组为null，无法进行操作");
        }
        return min;
    }
    public static void reverseElement(int[] arr){
        if(arr != null && arr.length > 0){
            for(int index = 0; index < arr.length/2; index++){
                int temp = arr[index];
                arr[index] = arr[arr.length - 1 -index];
                arr[arr.length - 1 - index] = temp;
            }
        }else{
            System.out.println("数组为null，无法进行操作");
        }
                 
    }
    public static int findArray (int[] arr, int key){
        if(arr !=null && arr.length >0){
            for(int index = 0; index < arr.length; index++){
                if(key == arr[index]){
                    key = arr[index];
                    return index;
                }

            }

        }else{
            System.out.println("数组为null，无法进行操作");
        }

            return -1;
    }
    public static void sortArray(int[] arr){
        if(arr != null && arr.length > 0){
            for(int i = 0; i < arr.length; i++){//第一个元素
                for(int j = 0; j < arr.length - 1 - i; j++){//第二个元素

                    if(arr[j] < arr[j + 1]){
                        int temp = arr[j];
                       arr[j] = arr[j + 1];
                       arr[j + 1] = temp;
                   }
                }
            }

        }

    }
}
