package multithreading;

public class TestPriority extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
class TestP {
    public static void main(String[] args) {
        TestPriority t = new TestPriority();
        TestPriority t1 = new TestPriority();
        t1.setPriority(10);
        t.start();
        t1.start();
    }
}
