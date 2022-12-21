package allCodeInOne.javaBs;

public class GreatestCommonDivider {
    static int gcd(int x, int y) {
        if (x == 0)
            return y;
        if (y == 0)
            return x;
        if (x == y)
            return  x;
        if (x > y)
            return gcd(x-y,y);
        return gcd(x,y-x);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }
}
