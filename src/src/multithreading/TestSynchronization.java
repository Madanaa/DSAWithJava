package multithreading;

public class TestSynchronization implements Runnable{
    int available = 1,passenger;
       TestSynchronization(int passenger) {
           this.passenger = passenger; // value of passenger is 1
       }

    @Override
    public synchronized void run() {
           String name = Thread.currentThread().getName();
           if (available >= passenger) { //1>
               System.out.println(name+" Seat reserved ");
               available = available - passenger;
           } else  {
               System.out.println("Seat Not reserved");
           }
    }
}
class Customer {
    public static void main(String[] args) {
        TestSynchronization t = new TestSynchronization(1);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.setName("Ram");
        t2.setName("Raju");
        t3.setName("Rammu");
        t1.start();
        t2.start();
        t3.start();
    }
}
