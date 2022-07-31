package array;

import java.util.Arrays;
import java.util.Scanner;

public class CumulativeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum[] = cumulativSum(a);
       for (int i = 0; i < sum.length;i++) {
           System.out.print(sum[i]+" ");
       }
    }
    public static int[] cumulativSum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum +a[i];
            a[i] = sum;
        }
        return a;
    }

}
