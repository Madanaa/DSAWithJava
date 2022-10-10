package multithreading;

public class MyThread  extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From Thread A : i = " +i);
        }
        System.out.println("Exit from A ");
    }

}
class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From Thread B : i = " +i);
        }
        System.out.println("Exit from B ");
    }

}
class C extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t From Thread C : i = " +i);
        }
        System.out.println("Exit from C ");
    }

}
class ThreadTest {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread1().start();
        new C().start();
    }
}



