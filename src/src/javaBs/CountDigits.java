package javaBs;

public class CountDigits {
    public static void main(String[] args) {
        int n = 5433231;
        int a = n;// original value
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(a+" "+count);
    }
}
