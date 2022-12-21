package allCodeInOne.multithreading;

public class MyThreada extends Thread{
    public void run() {
        System.out.println("Thread A start");
        for (int i = 1; i <= 5;i++) {
            System.out.println("\tThread A Running = "+i);
        }
        System.out.println("Thread A Exit");
    }

}
class  MyThreadb extends Thread {
    public void run() {
        System.out.println("Thread B start");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tThread B Running " +i);
        }
        System.out.println("Thread B Exit");
    }

}
class MyThreadc extends Thread {
    public void run() {
        System.out.println("Thread C start");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tThread C Running "+i);
        }
        System.out.println("Exit from C");
    }
}
class MyTreadTest {
    public static void main(String[] args) {
        new MyThreada().run();
        new MyThreadb().run();
        new MyThreadc().run();
    }
}