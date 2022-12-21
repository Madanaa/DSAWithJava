package day5;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n;i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
        for (int i = 0; i < n;i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
          a[i] = sc.nextInt();
        }
        insertionSort(a);
    }
}
