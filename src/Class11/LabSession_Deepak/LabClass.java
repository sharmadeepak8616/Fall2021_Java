package Class11.LabSession_Deepak;

import javax.swing.*;

public class LabClass {

    public static void main(String[] args) {

        String abc = "Hello world";

        // write code to convert string into uppercase

        System.out.println(abc.toUpperCase());



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
        String sentence1 = "make America great again";
        /*
            make America great again
            split(" ") -> "make", "America", "great", "again" (String[] array1)

            array1[0] -> "make"
            "make" -> charAt(0) -> "m"  // "make" -> subString(0,1) -> "m" (0)
            "m" -> toUppercase -> "M"

            array1[1] -> "America"
            "America" -> charAt(0) -> "A"  // "America" -> subString(0,1) -> "A" (0)
            "A" -> toUppercase -> "A"

            array1[2] -> "great"
            "great" -> charAt(0) -> "g"  // "great" -> subString(0,1) -> "g" (0)
            "g" -> toUppercase -> "G"

            array1[3] -> "again"
            "again" -> charAt(0) -> "a"  // "again" -> subString(0,1) -> "a" (0)
            "a" -> toUppercase -> "A"

            MAGA
         */
        // "make", "America", "great", "again" (String[] array1)
        String[] array1 = sentence1.split(" ");
        for (String val : array1) {     // val="make"
            System.out.println(val.substring(0,1).toUpperCase());
        }
        /*
            M
            A
            G
            A
         */


    }
}
