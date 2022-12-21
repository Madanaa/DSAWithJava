package allCodeInOne.binary;

public class AddTwoBinary {
    static String addBinary(String x, String y) {
        String res = "";
        int sum = 0;
        // traverse allCodeInOne.string starting to last
        int t = x.length()-1,  t1 = y.length()-1;
        while (t >= 0 || t1 >= 0 || sum == 1) {
            sum += ((t >= 0) ? x.charAt(t) - '0' : '0');
            sum += ((t1 >= 0) ? y.charAt(t1) - '0' : '0');
            res = (char)(sum % 2 + '0') + res;
            sum /= 2;
            t--;
            t1--;
        }
        return res;
    }

    public static void main(String[] args) {
        String x = "110";
        String y = "011";
        System.out.println(addBinary(x,y));
    }
}
