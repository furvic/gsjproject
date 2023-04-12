import java.util.Scanner;

public class test {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        if (sum >= 1 && sum <= 500000) {
            int[] arr = new int[sum];
            for (int i = 0; i < sum; i++) {
                int n = sc.nextInt();
                if (n >= 1 && n <= 500000) {
                    if (i+1>=sum){
                        break;
                    }else if (arr[i] >= n || arr[i] + arr[i + 1] >= n) {
                        if ((sum - 1) % 2 == 0) {
                            System.out.println((sum - 1) / 2);
                        } else {
                            System.out.println((sum - 1) / 2 + 1);
                        }
                    }
                }
            }
        }
    }
}
