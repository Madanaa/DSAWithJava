package pattern;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) { //row
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= (i-1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
