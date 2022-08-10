package array;

public class PostiveCumulativeArray {
    static int[] postiveCumulative(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length;i++) {
            if(a[i]!=0) {
                sum = sum + a[i];
                a[i] = sum;
            }
            else {
                return new int[]{sum};
            }
        }
        return a;
    }
    public static void main(String[] args) {

    }
}
