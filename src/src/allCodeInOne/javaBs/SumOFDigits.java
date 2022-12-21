package allCodeInOne.javaBs;

public class SumOFDigits {
    public static void main(String[] args) {
        int n = 1234;//4
        int sumOfdigit = 0;//4+3+2+1
        while (n > 0) {
            sumOfdigit += n % 10;
            //sumOfdigit++;
            n = n / 10;//4
        }
        System.out.println(sumOfdigit);
    }
}
