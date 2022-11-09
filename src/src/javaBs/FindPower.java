package javaBs;

public class FindPower {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);
    }
}
