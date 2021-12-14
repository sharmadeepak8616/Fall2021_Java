package Class6;

public class Homework3_Solution {
    public static void main(String[] args) {

        // Due Date: Nov 7

        String sentence1 = "Hello dear, how are you doing?";
        int result1 = sentence1.length() >= 10 ? 100 : 150;
        /**
         * Store 100 in result1 if the length of sentence1 is greater then or equal to 10
         * else store 150 in result1.
         *
         * use: Ternary operator
         *
         */
        System.out.println("\nresult1 = " + result1);


        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        /**
         * replace all instances of a/A with Z
         */
        System.out.println("\n"+sentence2.toLowerCase().replace("a", "Z"));

        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        /**
         * Print
         *  1. the length of the sentence3-value.
         *  2. result if the sentence3 starts with "health" (ignoring cases)
         *  3. result if the sentence3 contains "Body" (ignoring cases)
         *  4. index of "Body" in sentence3
         */
        System.out.println("\nsentence3 = " + sentence3);
        System.out.println("Length of sentence3 = " + sentence3.length());
        System.out.println("does sentence3 start with 'health'? : " + sentence3.toLowerCase().startsWith("health"));
        System.out.println("does sentence3 contain with 'body'? : " + sentence3.toLowerCase().contains("body"));
        System.out.println("Index of 'Body' in sentence3 : " + sentence3.toLowerCase().indexOf("body"));

    }
}
