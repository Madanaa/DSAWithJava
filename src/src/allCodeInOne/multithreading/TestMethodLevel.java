package allCodeInOne.multithreading;

public class TestMethodLevel {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}
class Table extends Thread{
    TestMethodLevel t;
    Table(TestMethodLevel t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}
class Table1 extends Thread {
    TestMethodLevel t;
    Table1(TestMethodLevel t) {
        this.t = t;
    }
    public void run() {
        t.printTable(7);
    }
}
class MainTest {
    public static void main(String[] args) {
        TestMethodLevel obj = new TestMethodLevel();
        Table t = new Table(obj);
        Table1 t1 = new Table1(obj);
        t.start();
        t1.start();

    }
}