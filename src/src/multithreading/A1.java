package multithreading;

import static java.lang.Thread.sleep;

public class A1 implements Runnable {

    public void run() {
       for (int i = 0; i <= 5; i++) {
           System.out.println("Child Thread");
           try {
               sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }

    public A1() {
    }
}
class B {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new A1());
        t.start();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Main Thread");
            sleep(1000);
        }

    }
}
