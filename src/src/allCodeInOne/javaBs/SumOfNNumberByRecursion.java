package allCodeInOne.javaBs;

public class SumOfNNumberByRecursion {
    static int getSum(int n) {
        if (n == 0)
            return n;
        return  n + getSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(8));
    }
}
