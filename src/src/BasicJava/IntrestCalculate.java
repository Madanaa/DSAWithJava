package BasicJava;

import java.util.Scanner;

public class IntrestCalculate {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double principalAmount = sc.nextDouble();
     double rate = sc.nextDouble();
     double time = sc.nextDouble();
     double interest = 0.0;
     interest =(principalAmount*rate*time)/100;
        System.out.println(interest);
        System.out.println(principalAmount+interest);

    }
}
