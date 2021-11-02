package Class3;

public class JavaOperators_Arithmetic {

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
        int num1 = 5;
        int num2 = 18;
        int num3 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
                        // 5 + 18 = 23


        int num4 = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + num4);
                        // 5 - 18 = -13

        int num5 = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + num5);
                        // 5 * 18 = 90

        int num6 = num2 / num1;
        System.out.println(num2 + " / " + num1 + " = " + num6);
                        // 18 / 5 = 3

        /**
         *      int/int = int
         *      double/int = double
         *      int/double = double
         *
         * If all number are int -> final value will be int
         * If any one of the numbers is double -> final value will be double
         *
         */
        // num1 = 5, num2 = 18, num3 = 23, num4 = -13
        int result = (num1 + num2) - (num1 - num4) * num2 + num3 / num1;
        /*
            (5 + 18) - (5 - -13) * 18 + 23 / 5
            23  - (5 - -13) * 18 + 23 / 5
            23 - 18 * 18 + 23 / 5
            23 - 18 * 18 + 4
            23 - 324 + 4
            - 301 + 4
            -297
         */
        System.out.println("result = " + result);

        /**
         * Convert deg-Fahrenheit into Deg-Celsius
         *
         * cT = (fT - 32) × 5/9
         * fT = 55
         * cT = 12.7778
         *
         */
        double fTemp = 55;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + "°F is equal to " + cTemp + "°C");

        /**
         * % -> Modulus Operator
         *
         * 23/5 -> 4 (remaining -> 3)
         * 9/3 -> 3 (remaining -> 0)
         * 16/7 -> 2 (remaining -> 2)
         *
         * 23%5 -> 3
         * 9%3 -> 0
         * 16%7 -> 2
         *
         */
        System.out.println("\n 40 % 5 = " + 40%5);    // 0
        System.out.println(" 20 % 3 = " + 20%3);    // 2
        System.out.println(" 11 % 4 = " + 11%4);    // 3

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
         *
         * pre -> increment the value in the variable
         *          then use the latest value of variable for whatever action/purpose.
         *
         */

        int inc = 5;    // inc = 5
        inc++;          // inc = 6
        System.out.println("value of inc = " + inc);        // value of inc = 6
        ++inc;          // inc = 7
        System.out.println("value of inc = " + inc);        // value of inc = 7

        System.out.println("value of inc = " + inc++);      // value of inc = 7 (inc=8)

        System.out.println("value of inc = " + inc);        // value on inc = 8

        System.out.println("value of inc = " + ++inc);      // inc = 9 , value of inc = 9

        



    }
}
