package allCodeInOne.javaBs;

public class GCD1 {
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y,x % y );
    }

    public static void main(String[] args) {
        System.out.println(gcd(4,6));
    }
}
