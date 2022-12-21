package allCodeInOne.multithreading;

public class TestA extends Thread{
    public void run() {

        for (int i = 0; i <= 5;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class A2 {
    public static void main(String[] args) throws InterruptedException {
        TestA t1 = new TestA();
        TestA t2 = new TestA();
        TestA t3 = new TestA();
        t3.setName("Madan");
        t3.start();
        t3.join();
        System.out.println("*****************");
        t1.start();
        t2.start();

    }
}