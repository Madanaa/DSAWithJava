package javaprogram;

public class StringPanagram {
    public static void main(String[] args) {
         String s = "abcdefghijklmnopqrstuvwxy";
        System.out.println(isPanagram(s));
    }
    public static boolean isPanagram(String s) {
        if(s.length() < 26) {
            return false;
        }
        else  {
            for (char ch = 'a'; ch <= 'z'; ch++)  {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return  true;
    }
}
