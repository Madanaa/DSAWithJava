package BasicJava;

public class GreatestCommonDivide {
    static int gcd(int u, int v) {
        if (u == 0)
            return v;
        return gcd(v % u,u);
    }
    static int lcm(int u, int v) {
        return (u / gcd(u,v)) * v;
    }

    public static void main(String[] args) {
        System.out.println(gcd(25,15));
        System.out.println(lcm(25,15));
    }

}
