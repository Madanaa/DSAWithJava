package allCodeInOne.javaBs;

import java.util.Scanner;

public class CountDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = sc.nextInt();
        int count = 0,n;
        while (num != 0) {
            n = num % 10;
            if (n==f) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
