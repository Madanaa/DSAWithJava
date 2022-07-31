package array;

import java.util.Scanner;

public class ArraySum {
    static int arraySum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(arraySum(a));
    }
}
