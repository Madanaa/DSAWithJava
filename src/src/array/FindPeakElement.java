package array;

public class FindPeakElement {
    static int findPeakInArray(int array[],int n) {
        if (n==1)
            return  0;
        if (array[0] >= array[1])
            return 0;
        if (array[n-1] >= array[n-2])
            return 1;
        for (int i = 1; i < n-1; i++) {
            if (array[i] >= array[i-1] && array[i] >= array[i+1])
                return  i;
        }
        return  0;
    }
    public static void main(String[] args) {
       int array[] = {1, 3, 20, 4, 1, 0};
       int n = array.length;
        System.out.println(findPeakInArray(array,n));
    }
}
