package BasicJava;

public class SwapValueWithoutVariable {
    static  void swapValue(int value1, int value2) {
        value1 = value1 - value2;
        value2 = value1 + value2;
        value1 = value2 - value1;
        System.out.println("Value1 is: "+value1+" Value2 is: "+value2);
    }

    public static void main(String[] args) {
          int v = 9;
          int v1 = 5;
          swapValue(v,v1);

    }
}
