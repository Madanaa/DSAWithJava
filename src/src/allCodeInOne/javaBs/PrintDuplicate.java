package allCodeInOne.javaBs;

public class PrintDuplicate {
    public static void main(String[] args) {
        int a[] = {1,6,8,4,8,4};
        for (int i = 0; i <a.length;i++) {
            for (int j = i +1; j < a.length; j++) {
                if (a[i] == a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
