package allCodeInOne.multithreading;

public class MyTread1a extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            //if (i ==1)
            System.out.println("\tThread a running = "+i);
           // if (i==1) yield();
          //  if (i==2) stop();
        }
        System.out.println("Exit from thread A");
    }
}
class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tThread B Running = "+i);
          //  if (i==3) stop();
        }
        System.out.println("Exit from B");
    }
}
class MyThreadTest1{
    public static void main(String[] args) {
        new MyTread1a().start();
        new MyThread3().start();
    }
}
