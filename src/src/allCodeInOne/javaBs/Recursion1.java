package allCodeInOne.javaBs;

public class Recursion1 {
    static int add(int n) {
        if(n < 1)
            System.out.println("N is less then 1");
        return add(n-1);
    }
    public static void main(String[] args) {
        System.out.println(add(7));
    }
}
