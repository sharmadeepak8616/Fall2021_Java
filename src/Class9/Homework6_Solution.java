package Class9;

import java.util.Arrays;

public class Homework6_Solution {
    public static void main(String[] args) {

        // Due Date: Nov 16

        /**
         * Q1:
         * Create the abbreviation for sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         * Good morning -> GM
         * Happy new Year -> HNY
         * Happy birthday to you dear -> HBTYD
         * happy new year to you dear -> HNYTYD
         *
         */
        String sentence1 = "Good morning";
        String abbreviation = "";
        String[] sentence1Array = sentence1.split(" ");
        for (String word : sentence1Array) {
            abbreviation += word.toUpperCase().charAt(0);
        }
        System.out.println("\nsentence1 = " + sentence1);
        System.out.println("abbreviation = " + abbreviation);

        /**
         * Q2:
         * Change the given sentence in titlecase
         *
         * HappY nEW YEAR to YoU dEAr -> Happy New year To You Dear
         * gooD morNING -> Good Morning
         * make AMERICA GreAT AgAIn -> Make America Great Again
         *
         */
        String sentence2 = "HappY nEW YEAR to YoU dEAr";
        String sentence2TitleCase = "";
        String[] sentence2Array = sentence2.toLowerCase().split(" ");
        for (String word : sentence2Array) {
            sentence2TitleCase = sentence2TitleCase + word.toUpperCase().charAt(0) + word.substring(1) + " ";
        }
        sentence2TitleCase = sentence2TitleCase.trim();
        System.out.println("\nsentence2 = " + sentence1);
        System.out.println("sentence2 TitleCase = " + sentence2TitleCase);

        /**
         * Q3:
         * Reverse a String
         *
         * Learn -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         *
         */
        String sentence3 = "Learn";
        String sentence3Reverse = "";
        String[] sentence3Array = sentence3.split(" ");
        for (int i=sentence3Array.length-1 ; i >= 0 ; i--) {
            sentence3Reverse = sentence3Reverse + sentence3Array[i] + " ";
        }
        sentence3Reverse = sentence3Reverse.trim();
        System.out.println("\nsentence3 = " + sentence3);
        System.out.println("sentence3Reverse = " + sentence3Reverse);


        /**
         * Q4:
         * Find the maximum value from given int-array
         *
         * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
         *
         * int[] = {23, 54, 76, 12}     ->  76
         *
         * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
         */
        int[] numberArray = {-2, -9, -4, -7, -9, -55};
        int maxFromArray = numberArray[0];

        for (int i=1 ; i < numberArray.length ; i++) {
            if (maxFromArray < numberArray[i]) {
                maxFromArray = numberArray[i];
            }
        }
        System.out.println("\nint-array -> " + Arrays.toString(numberArray));
        System.out.println("max value -> " + maxFromArray);




    }
}
