package Class15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_Examples {
    public static void main(String[] args) {


        // Read file abc.txt from desktop
        // if file(abc.txt) not found, Read file xyz.txt from desktop
        try {
            File file = new File("/Users/deepaksharma/Desktop/abcd.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            try {
                File file = new File("/Users/deepaksharma/Desktop/xyz.txt");
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } catch (FileNotFoundException e1) {
                System.out.println("File xyz.txt is not found");
            }
        }

        System.out.println("OUTSIDE ALL TRY-CATCH BLock");


        int[] numbers = {11, 22, 33, 44, 55};   // length = 5 (last index = 4)
        System.out.println("Array -> " + Arrays.toString(numbers));
        String inputStr = "";
        Scanner input = new Scanner(System.in);
        int errorCount = 0;

        while (errorCount < 3) {
            try {
                if (!inputStr.equalsIgnoreCase("no")) {
                    System.out.println("Enter the index value: ");
                    String inputIndexStr = input.next();                                    // InputMisMatchException
                    int inputIndex = Integer.valueOf(inputIndexStr);                        // NumberFormatException
                    System.out.println("Number at index is : " + numbers[inputIndex]);   // ArrayIndexOutOfBounds
                }
                System.out.println("Do you want to continue?");
                inputStr = input.next();
            } catch (InputMismatchException | NumberFormatException inputExp) {
                errorCount++;
                if (errorCount < 3 ) {
                    System.out.println("Start from beginning. " + (3 - errorCount) + " chances left");
                } else {
                    System.out.println("Closing app!! " + (3 - errorCount) + " chances left");
                }
            } catch (ArrayIndexOutOfBoundsException arrayIndexExp) {
                errorCount++;
                System.out.println("Error: incorrect index entered.Please enter between 0 and " + numbers.length);
                if (errorCount < 3 ) {
                    System.out.println("Start from beginning. " + (3 - errorCount) + " chances left");
                } else {
                    System.out.println("Closing app!! " + (3 - errorCount) + " chances left");
                }
            }
        }
    }
}
