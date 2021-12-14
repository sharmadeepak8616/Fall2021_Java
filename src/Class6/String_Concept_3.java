package Class6;

import java.util.Arrays;

public class String_Concept_3 {
    public static void main(String[] args) {

        /**
         * TO fetch a portion of String from given String using index values
         *
         * Method: subString()
         * return type: String
         *
         *
         *
         *
         * "given string value"
         *
         * give me data from index-0 to index-4 -> "give"
         *
         * give me data from index-2 -> "ven string value"
         *
         * Input is only beginIndex:
         *      if the beginIndex is valid
         *          return String from beginIndex to end of the String
         *      else
         *          StringIndexOutOfBoundsException
         *
         * Input is only beginIndex and endIndex:
         *      if the beginIndex and endIndex are valid
         *          return String from beginIndex to endIndex-1
         *      else
         *          StringIndexOutOfBoundsException
         *
         * --> This method does not change the value in original variable.
         *
         */

        String myString = "Health was Earlier said to Be the ability of the body functioning WElL. Health was Earlier said to Be...";
        System.out.println("myString = " + myString);

        String myString_1To5 = myString.substring(1,5);
        System.out.println("myString_1To5 = " + myString_1To5);

        String myString_From2 = myString.substring(2);
        System.out.println("myString_From2 = " + myString_From2);


        /**
         * To split a String from a specific point into multiple String values
         *
         * method: split()
         * return type: String[]
         */

        String stringHealth = "Health was Earlier said to Be the ability of the body functioning WElL.";

        String[] afterSplitBy_o = stringHealth.split("o");
        System.out.println(afterSplitBy_o);

        // shortcut to print Array
        System.out.println("\nArray after split by \"o\" -> " + Arrays.toString(afterSplitBy_o));

        String[] afterSplitBy_Space = stringHealth.split(" ");  // when we want to divide String into every word
        System.out.println("Array after split by space -> " + Arrays.toString(afterSplitBy_Space));


        String[] afterSplitBy_Nothing = stringHealth.split(""); // Array with every character at each index
        // "H", "e", "a", "l", "t", "h", " ", "w", "a", "s", " ",
        System.out.println("Array after split by \"\" -> " + Arrays.toString(afterSplitBy_Nothing));




















    }
}
