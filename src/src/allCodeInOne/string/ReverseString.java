package allCodeInOne.string;

public class ReverseString {
    public static String Reverse(String str) {

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i)+" ");
        }
        return str;
    }

    public static void main(String[] args) {
        Reverse("madan");
    }
}
