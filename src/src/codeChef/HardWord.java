package codeChef;

import java.util.Scanner;

public class HardWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count = 0;
            }
            else {
                count++;
                if (count > max) {
                    max=count;
                }
            }
        }
        if (max < 4) {
            System.out.println("YES");
        }
        else  {
            System.out.println("NO");
        }
    }
}
