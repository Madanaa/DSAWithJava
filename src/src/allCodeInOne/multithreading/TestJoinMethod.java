package allCodeInOne.multithreading;

public class TestJoinMethod extends Thread{
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                sleep(1000);
                System.out.println("Current thread is : "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

}
 class TestJoin{
    public static void main(String[] args) throws InterruptedException {
        TestJoinMethod t = new TestJoinMethod();
        TestJoinMethod t1 = new TestJoinMethod();
        TestJoinMethod t2 = new TestJoinMethod();
        t.setName("madan");
        t.start();
       // t.join();
       // t1.join();
        t1.start();
        t1.join();
        System.out.println("***********");
        t2.start();
       // t2.join();
    }
}

