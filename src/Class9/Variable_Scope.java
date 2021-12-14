package Class9;

import java.util.zip.GZIPInputStream;

public class Variable_Scope {

    /**
     * Types of variables:
     * 1. Field Variables (Global variable / Class Variables)
     *   Variables which we create inside the class but outside all methods
     *   Scope: entire class
     *   --> when we need to use the variable in multiple methods.
     *
     *
     * 2. Local Variables
     *  Variables which we create inside a method
     *  Scope: within the method.
     *
     * Constant variable (final variable)
     *  once value is assigned to them, changing would give you error.
     *  create it using "final" keyword
     *
     *  syntax:
     *  final datatype varName = value;
     *
     */

    static String name = "Happy Peace";        // Field Variable
    final static int zipCode = 10036;           // Field Variable (final)


    public static void main(String[] args) {
        int a = 10;     // Local variable (Scope : main method)

        // zipCode = 10020;

        final char INITIAL_1 = 'D';           // Local variable (final)
        final char INITIAL_2 = 'S';           // Local variable (final)

        // initial = 'A';

        System.out.println("a = " + a);

        a = 20;

        System.out.println("a = " + a);

        if (a < 10) {
            int a2 = 55;        // Local variable (Scope: if-block)
            System.out.println("a is less than 10" + a);

            System.out.println("a2 = " + a2);

        } else {

            int i = 22;

            System.out.println("i = " + i);


            System.out.println("a is greater than 10" + a);

        }

        for (int i = 0 ; i < 5 ; i++) {         //  Local variable (Scope: for-loop
            System.out.println("i = " + i);

            final String INSTITUTION_NAME;

            INSTITUTION_NAME = "NBA";


        }

        System.out.println("name from main method - " + name);


        System.out.println("my initials " + INITIAL_1 + INITIAL_2);

    }



    public void sayHello() {
        System.out.println("Hello " + name);
    }





}
