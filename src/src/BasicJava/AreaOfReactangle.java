package BasicJava;

import java.util.Scanner;

public class AreaOfReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double area = w * h;
        double perimeter = 2 * (w+h);
        System.out.printf("%.2f \n",area);
        System.out.printf("%.2f \n",perimeter);
    }
}
