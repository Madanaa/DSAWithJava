package allCodeInOne.method;

public class Method1 {
    public static void main(String[] args) {
        loop1();
        System.out.println("Method 2 print");
        loop2();
        System.out.println("Print again allCodeInOne.method 1");
        loop1();
    }
    public static void loop1() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
    public static void loop2 () {
        int a = 4;
        int b = 6;
        System.out.println(a+b);
    }
}
