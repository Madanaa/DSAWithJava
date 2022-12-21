package allCodeInOne.recursion;

public class SumOfDigit {
    public  int sumOfDigit(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumOfDigit(n/10);
    }
    public static void main(String[] args) {
        SumOfDigit sumOfDigit = new SumOfDigit();
        System.out.println(sumOfDigit.sumOfDigit(112));
    }
}
