package BasicJava;

public class AmongThreeNumber1 {
    static int BigestNumber(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        }
        else if (b > c && b > a) {
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(String[] args) {
        int a = 5, b = 10, c = 12;
        System.out.println(BigestNumber(a,b,c));
    }
}
