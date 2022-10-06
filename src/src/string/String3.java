package string;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
