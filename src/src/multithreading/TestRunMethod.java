package multithreading;

public class TestRunMethod extends Thread{
    public void run() {
        for (int i = 0; i<= 5;i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestRunMethod t = new TestRunMethod();
        TestRunMethod t1 = new TestRunMethod();
        System.out.println(t1.getName());
        t.run();
        System.out.println(t.getName());
        System.out.println("************************");
        t1.run();
    }
}
