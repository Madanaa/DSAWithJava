package genrictype;

public class Main1 {
    public static void main(String[] args) {
        ComparableInterface<Integer> data = new ComparableInterface<>(1);
        System.out.println(data.compareTo(1));
    }
}
