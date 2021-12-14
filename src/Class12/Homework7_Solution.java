package Class12;

import java.util.Arrays;

public class Homework7_Solution {

        // Due date: Tues (Nov 23rd `21)

        /**
         * Q1:
         * Create a method to make abbreviation for a given sentence
         * Method should return
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
        public static String createAbbreviation(String sentence) {
            String abbreviation = "";
            String[] sentence1Array = sentence.split(" ");
            for (String word : sentence1Array) {
                abbreviation += word.toUpperCase().charAt(0);
            }
            return abbreviation;
        }

        /**
         * Q2:
         * Create a method that will change the given sentence in Titlecase
         * Method should return
         *
         * HappY nEW YEAR to YoU dEAr -> Happy New year To You Dear
         * gooD morNING -> Good Morning
         * make AMERICA GreAT AgAIn -> Make America Great Again
         *
         */
        public static String toTitleCase(String sentence) {
            String sentenceTitleCase = "";
            String[] sentenceArray = sentence.toLowerCase().split(" ");
            for (String word : sentenceArray) {
                sentenceTitleCase = sentenceTitleCase + word.toUpperCase().charAt(0) + word.substring(1) + " ";
            }
            sentenceTitleCase = sentenceTitleCase.trim();
            return sentenceTitleCase;
        }

        /**
         * Q3:
         * Create a method to reverse a String (word by word)
         * Method should return
         *
         * Learn -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         *
         */
        public static String reverseStringWordByWord(String sentence) {
            String sentenceReverse = "";
            String[] sentenceArray = sentence.split(" ");
            for (int i=sentenceArray.length-1 ; i >= 0 ; i--) {
                sentenceReverse = sentenceReverse + sentenceArray[i] + " ";
            }
            sentenceReverse = sentenceReverse.trim();
            return sentenceReverse;
        }

        /**
         * Q4:
         * Create method to find the maximum value from given int-array
         * Method should return
         *
         * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
         *
         * int[] = {23, 54, 76, 12}     ->  76
         *
         * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
         */
        public static int getMaxFromIntArray(int[] numberArray) {
            int maxFromArray = numberArray[0];

            for (int i=1 ; i < numberArray.length ; i++) {
                if (maxFromArray < numberArray[i]) {
                    maxFromArray = numberArray[i];
                }
            }
            return maxFromArray;
        }

        /**
         * Q5:
         * Create a method to find if the given string is palindrome
         * Method should return (boolean)
         *
         * "level" -> true
         * "eye" -> true
         * "fall" -> false
         * "Level" ->
         */
        public static boolean isStringPalindrome(String word) {
            word = word.toLowerCase();
            String reverseWord = "";
            for (String alphabet : word.split("")) {
                reverseWord += alphabet;
            }
            return word.equalsIgnoreCase(reverseWord);
        }

        /**
         * Q6:
         * Create a method to find the average of given int-array
         * Method should return (double)
         *
         */
        public static double getAverageIntArray(int[] numberArray) {
            double avg = 0.0;
            int total = 0;
            for (int number : numberArray) {
                total += number;
            }
            avg = total/numberArray.length;
            return avg;
        }

        /**
         * Q7:
         * Create a method to find the longest String in the given String-array
         * Method should return (String)
         *
         * ["happy", "Happy new year", "peaceful" , "king kong"]    ->    "Happy new year"
         */
        public static String getLongestString(String[] stringArray) {
            String longestWord = stringArray[0];
            for (String word : stringArray) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            return longestWord;
        }

        public static void main(String[] args) {

            String sentence1 = "Good morning to you";
            System.out.println("\nQ1" + "\nsentence1 = " + sentence1 + "\nAbbreviation = " + createAbbreviation(sentence1));

            String sentence2 = "Good morning to you";
            System.out.println("\nQ2" + "\nsentence2 = " + sentence2 + "\nAfter TitleCase = " + toTitleCase(sentence2));

            String sentence3 = "Good morning to you";
            System.out.println("\nQ3" + "\nsentence3 = " + sentence3 + "\nAfter reverse (word by word) = " + reverseStringWordByWord(sentence3));

            int[] numbers4 = {12, 43, 65, 78, 23, 67};
            System.out.println("\nQ4" + "\nnumbers = " + Arrays.toString(numbers4) + "\nMax number = " + getMaxFromIntArray(numbers4));

            String word = "Racecar";
            System.out.println("\nQ5" + "\nword = " + word + "\nis '" + word + "' a Palindrome? : " + isStringPalindrome(word));

            int[] numbers5 = {12, 43, 65, 78, 23, 67};
            System.out.println("\nQ6" + "\nnumbers = " + Arrays.toString(numbers5) + "\nAverage = " + getAverageIntArray(numbers5));

            String[] words = {"happy", "Happy new year", "peaceful" , "king kong"};
            System.out.println("\nQ7" + "\nwords = " + Arrays.toString(words) + "\nLongest word = " + getLongestString(words));

        }
}
