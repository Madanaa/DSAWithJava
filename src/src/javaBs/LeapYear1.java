package javaBs;

public class LeapYear1 {
    public static void main(String[] args) {
        int leapYear = 2023;
        if (leapYear % 4 == 0 || (leapYear % 4 == 0 && leapYear != 100 )) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
        System.out.println("");
    }
}
