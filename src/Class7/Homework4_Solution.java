package Class7;

public class Homework4_Solution {
    public static void main(String[] args) {

        // Due Date: Nov 11

        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length() from String class)
         * Hint: you need to use split() method and length (from Array)
         */
        String country = "USA";
        System.out.println("Country = " + country);
        System.out.println("Length of " + country + " is " + country.split("").length);

        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("\nsentence2 : " + sentence2);
        System.out.println("Words in the sentence2 : " + sentence2.split(" ").length);

        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence3 = "make America great again";
        String abbreviation = "";

        String[] sentence3Array = sentence3.toUpperCase().split(" ");

        abbreviation += sentence3Array[0].charAt(0);
        abbreviation += sentence3Array[1].charAt(0);
        abbreviation += sentence3Array[2].charAt(0);
        abbreviation += sentence3Array[3].charAt(0);

        System.out.println("\nsentence3 = " + sentence3);
        System.out.println("abbreviation = " + abbreviation);




    }
}
