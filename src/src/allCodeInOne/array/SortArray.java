package allCodeInOne.array;

import java.util.Scanner;

public class SortArray {
    static Scanner sc = new Scanner(System.in);
    public static int[] getInteger(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void printArray(int a[]) {
        for (int i = 0; i < a.length;i++) {
            System.out.println(a[i]);
        }
    }
    public static void sortArray(int a[]) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] >= a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    flag = true;
                }
            }
        }
    }
    public static void main(String[] args) {
      int a[] = getInteger(5);
      sortArray(a);
      printArray(a);
    }
}
