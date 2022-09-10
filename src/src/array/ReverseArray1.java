package array;

import java.util.Scanner;

public class ReverseArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // size of an array is n
        int n = scanner.nextInt();
       // declare array
        int array[] = new int[n];
        // input array by for loop
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(array[i]+" ");
        }
    }
}
