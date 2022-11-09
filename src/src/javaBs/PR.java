package javaBs;

public class PR {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        for (int i = 0; i < n; i++) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /=10;
        }
//        for (int i = n-1; i >= 1; i--) {
//            System.out.println(i);
//        }
//        while (n > 0) {
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n /=10;
//        }
//        System.out.println(rev);
    }
}
