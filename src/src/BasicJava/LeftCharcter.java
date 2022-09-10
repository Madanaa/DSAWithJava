package BasicJava;

import java.util.Scanner;

public class LeftCharcter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            if(ch>='a' && ch<='w'){
                char printCharacter= (char)(ch+3);
                System.out.println(printCharacter);
            }
            else {
                System.out.println("Can’t jump");
            }

        }
        else {
            System.out.println("Not a small case");
        }
    }
}
