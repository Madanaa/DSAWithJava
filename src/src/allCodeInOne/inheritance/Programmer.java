package allCodeInOne.inheritance;

public class Programmer extends Employee {
    String code = "good";
    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.salary+" "+p.bonus+" "+p.code);


    }
}
