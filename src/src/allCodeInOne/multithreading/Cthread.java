package allCodeInOne.multithreading;

public class Cthread extends Thread{
    static int amount = 0;
    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
