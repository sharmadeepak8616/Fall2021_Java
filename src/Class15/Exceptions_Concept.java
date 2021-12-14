package Class15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_Concept {
    public static void main(String[] args) {

        int[] numbers = {11, 22, 33, 44, 55};   // length = 5 (last index = 4)

//        System.out.println(numbers[0]);     // 11
//
//        System.out.println(numbers[8]);     // ArrayIndexOutOfBoundsException
//
//        System.out.println(numbers[3]);     // 44


        System.out.println("Array -> " + Arrays.toString(numbers));
        String inputStr = "";
        Scanner input = new Scanner(System.in);

        while (!inputStr.equalsIgnoreCase("no")) {
            if (!inputStr.equalsIgnoreCase("no")) {
                System.out.println("Enter the index value: " );
                int inputIndex = input.nextInt();                                   // InputMisMatchException
                System.out.println("Number at index is : " + numbers[inputIndex]);  // ArrayIndexOutOfBounds
            }
            System.out.println("Do you want to continue?");
            inputStr = input.next();
            try {
                Thread.sleep(5000);                                                 // Interrupted Exception
            } catch (InterruptedException e) {
                System.out.println("sleep method is throwing Interrupted exception");
            }
            try {
                FileInputStream fs = new FileInputStream("./Desktop/abc.txt");                       // File Not Found Exception
            } catch (FileNotFoundException e) {
                System.out.println("File is not available");
            }
        }


//        try {
//            if (!inputStr.equalsIgnoreCase("no")) {
//                System.out.println("Enter the index value: " );
//                int inputIndex = input.nextInt();                                    // InputMisMatchException
//                System.out.println("Number at index is : " + numbers[inputIndex]);   // ArrayIndexOutOfBounds
//            }
//            System.out.println("Do you want to continue?");
//            inputStr = input.next();
//            Thread.sleep(5000);                                                 // Interrupted Exception
//            File file = new File("/Users/deepaksharma/Desktop/abc.txt");
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (InputMismatchException inputExp) {
//            System.out.println("Please enter integer value only");
//            inputExp.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException arrayIndexExp) {
//            System.out.println("Error: incorrect index entered.Please enter between 0 and " + numbers.length);
//            arrayIndexExp.printStackTrace();
//        } catch (InterruptedException | FileNotFoundException e) {
//            System.out.println("Compile Time exception occurred");
//        } finally {
//            System.out.println("Code from finally block");
//        }


        /**
         * Exceptions : Unhandled situations
         *
         * Exception (Class) can handle ALL exceptions
         *
         * Types:
         * 1. Compile Time Exceptions   (not same as Compile Time Error)
         *      eg: InterruptedException
         *          FileNotFoundException
         * 2. Run Time Exceptions       (not same as Run Time Error)
         *      eg: InputMismatchException
         *          ArrayIndexOutOfBoundsException
         *
         * How to handle exceptions:
         *  1. use "throws" keyword (DO NOT USE IT)
         *  2. use try-catch block  (similar if-else block)
         *
         * Code which can throw exception(s), we put in the try-block.
         * and exception(s) will be caught in respective catch blocks.
         * (1 try-block can have many catch blocks)
         *
         * Syntax:
         *      try {
         *          // code which
         *          // can throw exception(s)
         *      } catch (Exception-1 | Exception-4 e) {
         *          // code to execute if Exception-1 or Exception-4 occurs
         *      } catch (Exception-2 e) {
         *          // code to execute if Exception-2 occurs
         *      } catch (Exception-3 e) {
         *          // code to execute if Exception-3 occurs
         *      } finally {
         *          // code to run always whether an exception occur or not
         *      }
         *
         *
         * --> As soon as an exception occurs inside the try-block
         *  java will come out of the try-block, and
         *  go inside the catch block which can catch/handle the exception
         *  and, does NOT go back in the try-block.
         *
         * finally:
         *  It's a block associated with try-catch block.
         *  Code in the block will always executed whether exception occur or not
         *  --> There can be ONLY ONE finally block with every try-catch block.
         *
         *
         */



    }
}
