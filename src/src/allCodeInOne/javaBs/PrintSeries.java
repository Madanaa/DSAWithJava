package allCodeInOne.javaBs;

public class PrintSeries {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans -= i;
            }
            else {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
