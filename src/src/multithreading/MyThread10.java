package multithreading;

public class MyThread10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
