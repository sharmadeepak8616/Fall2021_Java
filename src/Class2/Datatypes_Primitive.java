package Class2;

public class Datatypes_Primitive {
    public static void main(String[] args) {

        /**
         * byte, short, int, long, float, double, char, boolean
         */

        /**
         * byte: is a Primitive datatype.
         * can store only whole number ranging from -128 to 127
         */

        // Write code to store number of cars in your house (4)
        byte numberOfMyCars = 4;

        // Write code to store your current age (25)
        byte myCurrentAge = 25;

        // what is the datatype of myCurrentAge variable?
        // Ans: byte

        // change value in myCurrentAge to 28
        myCurrentAge = 28;      // replaced the oldValue(25) with newValue(28)

        /**
         * short: is a Primitive datatype
         * can store whole number ranging from -32,768 to 32,767
         */
        // write variable to store number of rooms in your house (10)
        short numOfRooms = 10;

        // store number of days in an year
        short noOfDaysInYear = 366; // some calculation to calculate number of days
        short currentYear = 2020;

        System.out.println("365 days in an year");

        System.out.println("365");

        // Printing the value stored in a variable
        System.out.println("noOfDaysInYear");
        System.out.println(noOfDaysInYear);     // it will print value inside the variable

        System.out.println("Number of days in an year -> " + noOfDaysInYear);

        // There are 365 days in year 2021
        System.out.println("There are " + noOfDaysInYear + " days in year " + currentYear);
        //                  There are 365 days in year 2021



    }
}
