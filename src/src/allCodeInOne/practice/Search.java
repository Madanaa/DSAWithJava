package allCodeInOne.practice;

public class Search {
    void searchArray(int a[],int n) {
        int index = -1;
        for (int i = 0; i <a.length;i++) {
            if (a[i] == n) {
                index = index + a[i];
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found");
        }
    }

    public static void main(String[] args) {
        Search search = new Search();
        int a[] = {12,6,3,7};
        int n = 1;
        search.searchArray(a,n);
    }
}
