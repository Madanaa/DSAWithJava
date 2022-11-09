package javaBs;

public class PrintNum {
    public static void printNum(int n) {
        if (n <= 100)
            System.out.println(n);

        printNum(n+1);
    }

    public static void main(String[] args) {
        try {
            printNum(1);
        } catch (StackOverflowError error) {

        }
    }
}
