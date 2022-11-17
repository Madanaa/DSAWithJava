package practice;

public class PowerByRecursion {
    static int power(int b , int exponent) {
        if (exponent < 0)
            return -1;
        if (exponent == 0)
            return 1;
        return b * power(b,exponent-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2,0));
    }
}
