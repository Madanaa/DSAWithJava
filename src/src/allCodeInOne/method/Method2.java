package allCodeInOne.method;

public class Method2 {
    public static void loop(int c , int till) {
        while (c <= till) {
            System.out.println(c);

            c++;
        }
    }
    public static void main(String[] args) {
        loop(1,10);
        System.out.println("##############");
        loop(11,20);
    }
}
