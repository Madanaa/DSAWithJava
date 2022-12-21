package allCodeInOne.BasicJava;

public class SumOfOdd {
    static  int SumOdd(int n) {
        return n*n;
    }
    static int SumOfEven(int n) {
        return n *(n+1);
    }


    public static void main(String[] args) {
        int n = 10;

        System.out.println(SumOdd(n));
        System.out.println(SumOfEven(10));
    }
}
