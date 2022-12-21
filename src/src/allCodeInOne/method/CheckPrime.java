package allCodeInOne.method;

public class CheckPrime {
    public static void main(String[] args) {
        CalculatePrime prime = new CalculatePrime();
        if (prime.isPrime(8.6)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
