package condition;

import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String name= myObj.nextLine();
        if (name.equals("Hello"))
            System.out.println("Hi");

    }

}
