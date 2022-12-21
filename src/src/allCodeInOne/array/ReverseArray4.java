package allCodeInOne.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray4 {
    static void reverseArray(int array[]) {
        Collections.reverse(Arrays.asList(array));

    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        System.out.println(Arrays.asList(a));
       reverseArray(a);
    }
}
