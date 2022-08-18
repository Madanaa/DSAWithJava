package array;

public class LeftRotatation {
//    static void leftRotate(int a[], int d) {
//        if (d==1)
//            return;
//        int n = a.length;
//        d = d % n;
//     reverseArray(a,0,d-1);
//     reverseArray(a,d,n-1);
//     reverseArray(a,0,n-1);
//    }
//    static void reverseArray(int a[],int start, int end) {
//        int temp;
//        while (start < end) {
//            temp = a[start];
//            a[start] = a[end];
//            a[end] = temp;
//            start++;
//            end--;
//        }
//    }
//    static void printArray(int a[]) {
//        for (int i = 0; i < a.length;i++) {
//            System.out.println(a[i]+" ");
//        }
//    }
    static void leftRotate(int a[], int d) {
        if (d==1)
            return;
        int n = a.length;
        reverseArray(a,0,d-1);
        reverseArray(a,d,n-1);
        reverseArray(a,0,n-1);
    }
    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
    static void reverseArray(int a[], int start, int end) {
        int temp;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7};
   // int n = a.length;
    int d = 3;
    leftRotate(a,d);
    printArray(a);
    }
}
