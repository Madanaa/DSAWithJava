package string;

import java.util.Scanner;

public class RemoveSpacialChar {
    static  String removeSpacialChar( String str) {
       return str.replaceAll("[^ a-zA-Z0-9]"," ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeSpacialChar(str));
    }
}
