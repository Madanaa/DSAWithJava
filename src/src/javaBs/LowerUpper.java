package javaBs;

public class LowerUpper {
    public static void main(String[] args) {
        int ch = '#';
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
