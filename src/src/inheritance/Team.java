package inheritance;

public class Team extends Department {
    String team = "Mpro";


    public static void main(String[] args) {
        Team t = new Team();
       // t.salary = 4000;
        System.out.println(t.salary);
    }
}
