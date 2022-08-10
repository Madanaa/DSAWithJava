package BasicJava;

import java.util.Scanner;

public class IntrestCalculate {
    public static void main(String[] args) {
     double principalAmount = 0.0;
     double rate = 0.0;
     double time = 0.0;
     double interest = 0.0;
        Scanner sc = new Scanner(System.in);
        principalAmount = sc.nextDouble();
        rate = sc.nextDouble();
        time = sc.nextDouble();
       // Calculate Interest
        interest =(principalAmount*rate*time)/100;
        System.out.println(interest);
        System.out.println(principalAmount+interest);
    }
}
