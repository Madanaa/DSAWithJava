package javaBs;

public class SumOfNnumber {
    public static int sumOfNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumber(8));
    }
}
