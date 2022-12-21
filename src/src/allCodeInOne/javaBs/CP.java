package allCodeInOne.javaBs;

public class CP {
    public static void main(String[] args) {
        int n = 6;
        int fact = 0;
        int i = 2;
        while (n > i) {
            if (n % i == 0) {
                fact++;
                break;
            }
            i++;
        }
        if (fact == 1) {
            System.out.println("Not prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}
