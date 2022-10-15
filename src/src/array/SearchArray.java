package array;

public class SearchArray {
    public static boolean searchArray(int a[], int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {1,6,3,7};
        int n = 3;
        if (searchArray(a,n)) {
            System.out.println(n+" Number is found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
