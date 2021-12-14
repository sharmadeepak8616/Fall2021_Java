package Class11;

import java.util.Scanner;

public class Scanner_Concept {
    public static void main(String[] args) {

        System.out.println("My code");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string value: ");
        String value = input.nextLine(); // takes multiple words
        // String value = input.next();        // take only 1 word

        System.out.println("value = " + value);

        System.out.println("Please enter your age:");
        int age = input.nextInt();
        System.out.println("Age : " + age);

        System.out.println("Please enter your double-value:");
        double dNum = input.nextDouble();
        System.out.println("dNum = " + dNum);




    }
}
