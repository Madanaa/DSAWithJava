package array;

public class MinMaxSum {

    public static int findSum(int a[] , int n) {
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return  max + min;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int n = a.length;
        System.out.println(findSum(a,n));
    }
}
