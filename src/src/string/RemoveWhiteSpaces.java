package string;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    static String removeWhiteSpace(String str) {
        // \\s represent single space
        return str.replaceAll("\\s","");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeWhiteSpace(str));
    }
}
