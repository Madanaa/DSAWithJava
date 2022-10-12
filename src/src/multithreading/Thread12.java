package multithreading;

public class Thread12 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Madan");
       // System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
