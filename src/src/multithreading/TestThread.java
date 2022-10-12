package multithreading;

public class TestThread extends Thread{
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        TestThread t = new TestThread();
        t.start();
       try {
           t.start();
       } catch (IllegalThreadStateException e) {
           System.out.println("Never started again");
       }

    }
}
