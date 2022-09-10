package array;

import java.util.Scanner;

public class ReverseArray {
    static  void reverseArray(int aarray[], int start, int end) {
        int temp;
        while (start < end) {
            temp = aarray[start];
            aarray[start] = aarray[end];
            aarray[end] = temp;
            start++;
            end--;
        }
    }
    static  void  printArray(int a[]) {
        for (int p: a) {
            System.out.print(p+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
      reverseArray(a,s,e);
      printArray(a);
    }
}
