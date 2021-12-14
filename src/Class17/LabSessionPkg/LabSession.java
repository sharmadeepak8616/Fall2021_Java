package Class17.LabSessionPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabSession {

    public static void main(String[] args) {

        int[] numbers = {11, 22, 33, 44, 55};   // length = 5 (last index = 4)
        System.out.println("Array -> " + Arrays.toString(numbers));
        String inputStr = "";
        Scanner input = new Scanner(System.in);

        if (!inputStr.equalsIgnoreCase("no")) {                      // !inputStr.equalsIgnoreCase("no")
            System.out.println("Enter the index value: " );
            int inputIndex = input.nextInt();                                    // InputMisMatchException
            System.out.println("Number at index is : " + numbers[inputIndex]);   // ArrayIndexOutOfBounds
        }
        System.out.println("Do you want to continue?");
        inputStr = input.next();
        try {
            Thread.sleep(5000);                                                 // Interrupted Exception
            File file = new File("/Users/deepaksharma/Desktop/abc.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // code to execute if FileNotFoundException occurs
        } catch (InterruptedException e) {
            // code to execute if InterruptedException occurs
        }
        // Thread.sleep(2000);


        // create a code to find the value from given int-array
        try {
            int[] values = {56, 23, 12, 65, 87, 98, 23};
            Scanner scan = new Scanner(System.in);
            int numToFind = scan.nextInt();              // user interactive 66
            boolean isNumFound = false;
            for (int i=0 ; i < values.length ; i++) {
                if (values[i] == numToFind) {
                    isNumFound = true;
                    break;
                }
            }
            if (isNumFound) {
                System.out.println(numToFind + " is present in the array");
            } else {
                System.out.println(numToFind + " is NOT present in the array");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid data entered, pls enter an integer value.");
        }
    }

    /*
            for (int i=0 ; i < values.length-1 ; i++) {
                if (values[i] == numToFind) {
                    isNumFound = true;
                    break;
                }
            }
            if (isNumFound) {
                System.out.println(numToFind + " is present in the array");
            } else {
                System.out.println(numToFind + " is NOT present in the array");
            }
     */


    // Task-1:
    // Create method to print the duplicate values from an array. (List/ArrayList)
    /*
        {"happy", "peace", "happy", "peaceful"}
        happy

        {"happy", "learning", "Happy", "LEARNING", "learn", "GROW", "Happy"}
        happy, learn

     */

    // Task-2:
    // Create method to verify if the entered String is an email
    // Regular Expression (https://howtodoinjava.com/java/regex/java-regex-validate-email-address/)
    /*
        abcd@xyz.nnn    <- true
        abcd.nnn        <- false
     */

    // Task-3:
    // Create a method to find if input string satisfies the password conditions
    /*
        Conditions:
                must contain '@' only once
                and, length must be between 8 to 20
     */
    /*
        abcd@1234                       <-  true
        @abcd123                        <-  true
        abcd@123@                       <-  false
        @abcd12                         <-  false
        abcdefghijklmnopq@1234567890    <-  false
     */

}
