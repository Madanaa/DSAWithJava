package allCodeInOne.array;

import java.util.Scanner;

public class ArrayAve {
    public  static Scanner sc = new Scanner(System.in);
    public static double getAverageSum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return (double) sum/(double) a.length;
    }
    static int[] getInteger(int n) {
        int a[] = new int[n];
        for (int i = 0; i < a.length;i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static  void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
     int a[] = getInteger(5);
     printArray(a);
        System.out.println(getAverageSum(a));
    }
}
