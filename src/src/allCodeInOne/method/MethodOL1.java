package allCodeInOne.method;

public class MethodOL1 {
    static void change(int  n) {
         n = 85;
    }
    static void change1(int [] a) {
        a[0] = 91;
    }

    public static void main(String[] args) {
        int [] a ={65};
        int x = 45;
        //change the allCodeInOne.array
        change1(a);
        System.out.println(a[0]);
    }
}
