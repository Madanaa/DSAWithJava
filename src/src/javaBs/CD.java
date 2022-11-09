package javaBs;

public class CD {
    public static void main(String[] args) {
        int n = 6768989;
        int count = 0;
        for (int i = 0; i <= n; i++) {
            n = n / 10;
            count++;
        }
        while (n > 0) {
            n = n / 10;
            count++;
        }
//        for (int p : n) {
//
//        }
        System.out.println(count);
    }
}
