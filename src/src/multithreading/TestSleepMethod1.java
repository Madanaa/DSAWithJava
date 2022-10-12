package multithreading;

public class TestSleepMethod1 extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(-1000);
                System.out.println(i);
            } catch (IllegalArgumentException | InterruptedException e) {
                System.out.println("Value is negative");
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod1 t = new TestSleepMethod1();
        t.start();
    }

}
