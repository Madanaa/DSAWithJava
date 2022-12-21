package allCodeInOne.multithreading;

public class ThreadPriority extends Thread{
    public void run() {
        System.out.println("running thread priority is : "+currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriority m = new ThreadPriority();
        ThreadPriority m1 = new ThreadPriority();
        m.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(Thread.MAX_PRIORITY);
        m.start();
        m1.start();
    }

}
