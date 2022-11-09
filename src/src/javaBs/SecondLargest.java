package javaBs;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {2,8,9,876,35};
        Arrays.sort(a);
        System.out.println(a[a.length-2]);
    }
}
