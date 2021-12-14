package Class4;

public class JavaOperators_Arithmetic_2 {

    public static void main(String[] args) {

        /**
         * Arithmetic (+, -, *, /, %, ++, --)
         * +
         * -
         * *
         * /
         * %    Modulus Operator
         * ++   increment operator (pre-increment/post-increment operator)
         * --   decrement operator (pre-decrement/post-decrement operator)
         *
         */

        /**
         * Increment Operator (++)
         *      increment the current value in variable by 1
         *
         *
         * pre-increment and post-increment
         *
         * int b = 10;
         * b++;     --> post-increment
         * ++b;     --> pre-increment
         *
         * post -> use the current value of variable for whatever action/purpose,
         *          then increment the value in the variable.
         *          (use present-value for action, perform-increment)
         *
         * pre -> increment the value in the variable
         *          then use the latest value of variable for whatever action/purpose.
         *          (perform-increment, use present-value for action)
         */

        int inc = 5;    // inc = 5
        inc++;          // inc = 6
        System.out.println("value of inc = " + inc);        // value of inc = 6
        ++inc;          // inc = 7
        System.out.println("value of inc = " + inc);        // value of inc = 7

        System.out.println("value of inc = " + inc++);      // value of inc = 7 (inc=8)

        System.out.println("value of inc = " + inc);        // value on inc = 8

        System.out.println("value of inc = " + ++inc);      // inc = 9 , value of inc = 9

        int num1 = 10;                                      // num1=10

        num1++;                                             // num1=11

        int num2 = ++num1;                                  // (pre-increment then Assignment) num1=12 , num2=12

        num2 = num1++;                                      // (Assignment then post-increment) num2=12 , num1=13

        System.out.println("num2 = " + num2);               // "num2 = 12" (num2=12 , num1=13)

        System.out.println("num1 = " + ++num1);             // (pre-Increment and sout) "num1 = 14" (num2=12 , num1=14)

        System.out.println("num2 = " + num2++);             // (sout and postIncrement) "num2 = 12" (num2=13 , num1=14)

        System.out.println("num2 = " + num2);               // (sout) "num2 = 13" (num2=13 , num1=14)

        System.out.println("num1 = " + num1++);             // (sout and postIncrement) "num1 = 14" (num2=13 , num1=15)

        System.out.println("result = " + (++num2 + num1++));    // (sout and postIncrement) "result = " (num2=13 , num1=15)
            /*
                (++num2 + num1++)                               // (pre-Increment -> add -> sout -> post-Increment)
                                                                // num1=15 , num2=14  (pre-Increment)
                                                                // num2 + num1         29 (result)
                                                                // "result = 29"
                                                                // num1=16 , num2=14
             */
        System.out.println("num2 = " + num2);                   // "num2 = 14"

        System.out.println("num1 = " + num1);                   // "num1 = 16"


        /**
         * Decrement Operator (--)
         *      decrements the current value in variable by 1
         *
         *
         * pre-decrement and post-decrement
         *
         * int b = 10;
         * b--;     --> post-decrement
         * --b;     --> pre-decrement
         *
         * post -> use the current value of variable for whatever action/purpose,
         *          then decrement the value in the variable.
         *          (use present-value for action, perform-decrement)
         *
         * pre -> decrement the value in the variable
         *          then use the latest value of variable for whatever action/purpose.
         *          (perform-decrement, use present-value for action)
         */

        System.out.println("\nDecrementing...\n");
        int dec = 2;

        System.out.println(dec--);      // print-> 2    (sout and post-decrement) dec=1

        System.out.println(--dec);      // print-> 0    (pre-decrement and sout) dec=0


    }
}
