package array;

import java.util.Arrays;

public class MinMaxArraySum {
    static  void findSum(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Arrays.sort(a);
             sum = a[0] + a[a.length-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a[] = {-1,3,6,7};
        int n = a.length;
        findSum(a,n);
    }
}
