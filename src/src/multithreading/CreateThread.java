package multithreading;

import static java.lang.Thread.sleep;

public class CreateThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Madan");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class A {
    public static void main(String[] args) throws InterruptedException {
       CreateThread t = new CreateThread();
        t.start();
        for (int i = 0; i <= 5;i++) {
            System.out.println("Gangwar");
            sleep(1000);
        }
    }
}


