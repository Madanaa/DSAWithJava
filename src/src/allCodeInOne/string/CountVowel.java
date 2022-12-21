package allCodeInOne.string;

public class CountVowel {
    public static int countV(String s) {
        int count = 0;
        for (int i = 0; i < s.length();i++) {
            int ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countV("Hello"));
    }
}
