package allCodeInOne.multithreading;

public class SleepMethodTest  extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (IllegalThreadStateException | InterruptedException e) {
                throw new IllegalThreadStateException();
            }

        }
       // try {
            for (int i = 0; i <= 5; i++) {
                //  sleep(1000);
                System.out.println(i);
                ;
                //  }
//
            }
        }
    //}

    public static void main(String[] args) throws IllegalThreadStateException {
        SleepMethodTest t = new SleepMethodTest();
        SleepMethodTest t1 = new SleepMethodTest();
        t.start();
        t.start();
    }
}
