package inheritance;

public class Department extends Programmer {
    String dept ="IT";

    public static void main(String[] args) {
        Department d = new Department();
        System.out.println(d.salary);
    }
}
