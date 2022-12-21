package allCodeInOne.method;

public class CalculatePrime {
    public static boolean isPrime(int num) {
        int temp;
        boolean prime = true;
        for (int i = 2; i <= num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static boolean isPrime(double num) {
        int num1 = (int)num;
        int temp;
        boolean prime = true;
        for (int i = 2; i <= num1/2;i++) {
            temp = num1 % i;
            if (temp == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
