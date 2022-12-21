package allCodeInOne.BasicJava;

public class AmongThreeNumber {
    static int greatestNumber(int x, int y, int z) {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    public static void main(String[] args) {
        System.out.println(greatestNumber(8,10,9));
    }
}
