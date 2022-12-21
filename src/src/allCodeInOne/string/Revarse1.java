package allCodeInOne.string;

public class Revarse1 {
    static void reverseString(String str) {
        char [] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
    }

    public static void main(String[] args) {
          reverseString("Hello");
    }
}
