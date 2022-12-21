package allCodeInOne.javaBs;

public class FindPerfectNumber {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            if (n == sum) {
                System.out.println("Perfect number");
            }
            else {
                System.out.println("Not a perfect number");
            }
        }
    }
}
