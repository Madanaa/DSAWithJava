package javaBs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i,temp1,temp2,rem,n=0,result = 0;
        for ( i = n1; i < n2; i++) {
            temp1 = i;
            temp2 = i;
            while (temp1 != 0) {
                temp1 /= 10;
                n++;
            }
            while (temp2 != 0) {
                rem = temp2 % 10;
                result += Math.pow(rem,n);
                temp2 /= 10;
            }
            if (result == i) {
                System.out.print(i+" ");
            }
            n = 0;
            result = 0;
        }
    }
}
