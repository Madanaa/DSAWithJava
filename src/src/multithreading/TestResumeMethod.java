package multithreading;

public class TestResumeMethod extends Thread{
    public void run() {
        for (int i = 1; i <= 5;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
class Test {
    public static void main(String[] args) {
        TestResumeMethod t = new TestResumeMethod();
        TestResumeMethod t1 = new TestResumeMethod();
        TestResumeMethod t2 = new TestResumeMethod();
        t.start();
        //t1.suspend();
        t2.start();
        //t1.resume();
    }
}
