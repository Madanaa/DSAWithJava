package allCodeInOne.multithreading;

public class Test1Thread extends Thread{
    private int threadNo;
    public Test1Thread(int threadNo) {
        this.threadNo = threadNo;
    }
    public void run() {
        countMe();
    }
    public void countMe() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value if i is "+i+ " and the thread no is "+threadNo);
        }
    }
}
class App {
    public static void main(String[] args) {
        Test1Thread t = new Test1Thread(1);
        Test1Thread t1 = new Test1Thread(2);
        long startTime = System.currentTimeMillis();
       t.run();
        System.out.println("******************");
       t1.run();
       long endTime = System.currentTimeMillis();
        System.out.println("Total time required "+(endTime-startTime));
    }
}
