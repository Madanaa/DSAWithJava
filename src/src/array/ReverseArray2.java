package array;

import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create size n for array
        int n = scanner.nextInt();
        // create array
        int array[] = new int[n];
        // input array for loop
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        //initialized two variable start and end
        int start = 0, end = n-1;

        while (start < end) {
            // swap array elements by temp variable
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
