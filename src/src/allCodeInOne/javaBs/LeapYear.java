package allCodeInOne.javaBs;

public class LeapYear {
    public static void main(String[] args) {
        int leapYear = 2020;
        if (leapYear % 4 == 0) {
            System.out.println("Leap Year");
        }
        else if (leapYear % 4 == 0 && leapYear != 100) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not A Leap Year");
        }
    }
}
