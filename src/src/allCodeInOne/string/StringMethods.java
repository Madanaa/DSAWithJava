package allCodeInOne.string;

public class StringMethods {
    public static void main(String[] args) {
        String string = "Madan";
        string = "Hello Madan";
        System.out.println(string);
        //return length of allCodeInOne.string
        System.out.println(string.length());
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        String str = "    Madan     ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(string.substring(3));
        System.out.println(string.substring(2,5));
        System.out.println(string.replace('H','m'));


    }
}
