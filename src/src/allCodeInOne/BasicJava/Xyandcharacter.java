package allCodeInOne.BasicJava;

import java.util.Scanner;

public class Xyandcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char c = sc.next().charAt(0);
        if(c >= 'A' && c <='Z') {
            System.out.println(x+y);
        }
        else if(c >= 'a' && c <= 'z') {
            System.out.println(x-y);
        }
        else {
            System.out.println(x%y);
        }
    }
}
