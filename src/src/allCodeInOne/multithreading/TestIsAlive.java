package allCodeInOne.multithreading;

public class TestIsAlive extends Thread{
    public void run() {
        int i =1;
        while (i < 5) {
            System.out.println("Thread name = "+Thread.currentThread().getName());
            i++;
        }
    }
}
class Test2 {
    public static void main(String[] args) {
        TestIsAlive t = new TestIsAlive();
        TestIsAlive t1 = new TestIsAlive();
        System.out.println(t.isAlive());
        t.start();
        System.out.println("*******************");
        t1.start();
        System.out.println(t1.isAlive());
    }
}
