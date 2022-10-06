package multithreading;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Thread t = new Thread(String.valueOf(m));
        t.start();
    }
}
