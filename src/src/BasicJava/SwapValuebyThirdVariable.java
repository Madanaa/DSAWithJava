package BasicJava;

public class SwapValuebyThirdVariable {
    static void swapValue(int value1, int value2) {
        int temp = value1;
        value1 = value2;
        value2 = temp;
        System.out.println("Value 1 "+value1+ " and Value2 " +value2);
    }
    public static void main(String[] args) {
   int value1 = 9;
   int value2 = 5;
   swapValue(value1,value2);
    }
}
