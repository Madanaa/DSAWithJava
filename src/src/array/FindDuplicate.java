package array;

import java.util.Objects;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = {12,34,2,4,2};
        int duplicate = 0;
        for ( int i = 0; i <a.length;i++) {
            for (int j = i+1; j < a.length;j++) {
                if (a[i]==a[j] && (i != j)){
                    System.out.println(a[j]);
                }
            }

        }

    }
}
