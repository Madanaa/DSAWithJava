package allCodeInOne.BasicJava;

public class ODDEVESUM {
    public static void main(String[] args) {
        int sum  = 0;
        for (int i = 0; i <= 5; i = i+2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}