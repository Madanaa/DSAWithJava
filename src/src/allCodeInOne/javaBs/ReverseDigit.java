package allCodeInOne.javaBs;

public class ReverseDigit {
    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;
        while (n > 0) {
            ans = (ans*10 + n % 10);
            n /=10;
        }
        System.out.println(ans);
    }
}
