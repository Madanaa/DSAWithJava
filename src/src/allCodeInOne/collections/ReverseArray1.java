package allCodeInOne.collections;

import java.util.Scanner;

public class ReverseArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0 ; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
