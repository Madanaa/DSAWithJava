package array;

import java.util.Scanner;

public class SubArrayMaxXOR {
    static int maxSubArrayXOR(int a[], int n) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            int xor = 0;
            for(int j = i; j < n; j++) {
                xor = xor ^ a[j];
                res = Math.max(res,xor);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(maxSubArrayXOR(a,n));

    }
}
