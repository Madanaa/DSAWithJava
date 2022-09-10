package array;

public class BinarySearchDemo {
    public  static boolean binarySearch(int a[], int size, int value) {
        int low = 0;
        int high = size- 1;
        int mid;
        while ( low <= high) {
            mid = (low+high)/2;
            if (a[mid] == value) {
                return true;
            }
            else  if (a[mid] < value) {
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] a = {1,3,5,7,9,25,30};
        System.out.println(binarySearch(a,7,9));
    }
}
