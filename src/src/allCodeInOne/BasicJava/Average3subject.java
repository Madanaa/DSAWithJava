package allCodeInOne.BasicJava;

import java.util.Scanner;

public class Average3subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int ave = (mark1+mark2+mark3)/3;
        System.out.println(ave);
    }
}
