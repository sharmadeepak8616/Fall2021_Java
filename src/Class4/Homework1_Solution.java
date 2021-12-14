package Class4;

public class Homework1_Solution {

    /**
     *
     * Due: Friday, November 5
     *
     * Store values for below scenario in an appropriate variable, and print the same in Console.
     *  1. number of hours in a day
     *  2. max no. of days in an year
     *  3. total number of employees in an organization
     *  4. Population in a country
     *  5. Mortgage rate
     *  6. Balance in an bank account
     *  7. does the sun rise from the West?
     *  8. Initials of your name (Use: char)    // My initials are DS
     *
     */

    public static void main(String[] args) {

        byte dayHours = 24;
        System.out.println("Total number of hours in a day is " + dayHours);

        short daysInYear = 365;
        System.out.println("Total number of days in an year is " + daysInYear);

        int totalEmployees = 980988;
        System.out.println("Total number of employees in my company : " + totalEmployees);

        long population = 98174647474L;
        System.out.println("Population in this country is : " + population);

        float mortgageRate = 1.1f;
        System.out.println("Current mortgage rate is : " + mortgageRate + "%");

        double bankBalance = 990987.89;
        System.out.println("Bank balance : $" + bankBalance);

        boolean isSunRiseWest = false;
        System.out.println("does the sun rise from the West? - " + isSunRiseWest);

        char fInitial = 'D', lInitial = 'S';
        System.out.println("My initials : " + fInitial+lInitial);


    }


}
