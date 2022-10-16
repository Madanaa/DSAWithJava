package array;

public class LinearSaerch1 {
    public static Integer search(Integer n, Integer[] list) {
        int index = -1;
        for (int i = 0; i < list.length;i++) {
            if (list[i].equals(n)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
       Integer a[] ={1,5,7,8};
      // Integer n = a.length;
        System.out.println(search(2,a));
    }
}
