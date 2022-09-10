package array;

import java.util.Scanner;

public class ReverseArray3 {
    static void reverseRecursive(int array[], int start, int end) {
        if (start >= end)
            return;

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // recursive call to swap arr[start+1] & arr[end-1]
        reverseRecursive(array, start + 1, end - 1);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size");
        // array size
        int size = scanner.nextInt();
        // create array
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = array.length;
        int start = 0, end = n - 1;
        reverseRecursive(array, start, end);
        System.out.print("Reverse Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i]+" ");
    }
}


