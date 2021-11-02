package Class3;

public class Datatypes_Primitive_2 {
    public static void main(String[] args) {

        /**
         * byte, short, int, long, float, double, char, boolean
         */

        /**
         * int: is a primitive datatype
         * can store only whole number ranging from -2,147,000,000 to 2,147,000,000
         *
         * In general, we use int-variable to store whole number.
         * By default, Java treats every whole number as int
         */
        int myDogAge = 1;
        int covidCases = 11118498;

        System.out.println("Covid cases so far = " + covidCases);

        /**
         * long: is a primitive datatype
         * can store only whole number ranging from
         * -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
         *
         * To store any value as "long" in java-memory (make java treat value as "long" instead "int")
         * we need to add "L" after the value.
         *
         * L is an indicator for Java to treat value as "long" instead "int"
         *
         */

        long numOfRooms = 10L;
        // Java is storing int-value(10) into a long-variable
        // numOfRooms contains value = 10

        long numberOfStars = 2321234566L;
        // numberOfStars contains value = 2321234566

        // Dog age is x-years and weighs y-pound
        int dogAge = 1;
        int dogWeight = 20;

        System.out.println("Dog age is "+dogAge+"-years and weighs "+dogWeight+"-pound");

        /**
         * float: is a primitive datatype
         * which can store value with decimal points
         *
         * By default, Java treats every decimal-point number as double
         */
        float mortageRate = 1.1f;
        // f is an indicator for Java to treat decimal-values as float instead double
        System.out.println("\nMortgage Rate = " + mortageRate);

        /**
         * double: is a primitive datatype
         * which can store value with decimal points
         *
         * By default, Java treats every decimal-point value as double
         */
        double myDogWeight = 5;     // store 5.00 in myDogWeight variable
        System.out.println("Dog weight = " + myDogWeight);

        double accountBalance = 10000000.12;

        /**
         * char: is a primitive datatype
         * can store only single character of anything
         *
         * value must be enclosed in single-quote while storing in the char-variable.
         */
        char grade = 'A';
        //   char  = char

        char firstNum = '1';
        System.out.println("Counting starts with " + firstNum);

        /**
         * boolean: is a primitive datatype
         * can store either true or false as value
         */
        boolean isItRaining = false;
        System.out.println("\nis it raining right now? = " + isItRaining);

        boolean isEligibleToVote = true;
        System.out.println("are you eligible to vote? = " + isEligibleToVote);











    }
}
