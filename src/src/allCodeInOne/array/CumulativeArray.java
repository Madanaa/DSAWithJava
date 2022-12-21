package allCodeInOne.array;

import java.util.Scanner;

public class CumulativeArray {
    static  int[] cumulativeArray(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length;i++) {
            sum = array[i] + sum;
            array[i]=sum;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int a[] = cumulativeArray(array);
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]+" ");
        }
    }

}
