package Class7;

public class Loops_Concept {
    public static void main(String[] args) {

        /**
         * Loops:
         *      when we need to execute set of code multiple times.
         *
         * 1. for loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4. do-while loop
         */

        String[] words = {"Joy", "smile", "learn"};
        /*
            print the words from Array like below:
            Health
            Wealth
            pray
            happy
            Joy
            smile
            learn
            heal
         */
//        System.out.println(words[0]);   // i=0, [0]
//        System.out.println(words[1]);   // i=1, [1]
//        System.out.println(words[2]);
//        System.out.println(words[3]);
//        System.out.println(words[4]);
//        System.out.println(words[5]);   // i=5, [5]

        /**
         * Syntax for-loop
         *
         * for (initialization ; condition ; increment ) {
         *      // code inside
         *      // for-loop
         * }
         */
        for (int i = 0 ; i <= words.length-1 ; i++ ) {
            System.out.println(words[i]);
        }
        /*
            1. initialization (int i=0)
            2. evaluates the condition with present value of i ( i <= words.length -1 )
            3. if the condition result into true
                    java enters in the for-loop, and executes the code inside for-loop
                    while going back to for-loop, java performs the increment operation
               else
                    java won't enter inside the for-loop and moves to the code after for-loop
            4. evaluates the condition with present value of i ( i <= words.length -1 )
            5. if the condition result into true
                    java enters in the for-loop, and executes the code inside for-loop
                    while going back to for-loop, java performs the increment operation
               else
                    java won't enter inside the for-loop and moves to the code after for-loop

         */

        String[] newWords = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
        /**
         * print the array-words in reverse order
         *
         * learn        sout(newWords[newWords.length-1])                   // initial-value i = 1
         * smile        sout(newWords[newWords.length-2])                   // i = 2
         * Joy          sout(newWords[newWords.length-3])                   // i = 3
         * king         sout(newWords[newWords.length-4])                   // i = 4
         * learn
         * speak
         * healthy      sout(newWords[newWords.length-newWords.length])     // last-value i = newWords.length   (1, 2, 3, 4, ...., newWords.length)
         *
         *
         * sout(newWords[newWords.length-i])
         *
         * int i = 1 ; i <= newWords.length ; i++
         *
         */
        System.out.println("\n -- reverse order");
        for (int i = 1 ; i <= newWords.length ; i++) {
            System.out.println(newWords[newWords.length-i]);    // i=1,2
        }

        /*
         * learn        sout(newWords[i])                   // initial-value i = newWords.length-1  (6)
         * smile        sout(newWords[newWords.length-2])                   // i = newWords.length-2                (5)
         * Joy          sout(newWords[newWords.length-3])                   // i = newWords.length-3                (4)
         * king         sout(newWords[newWords.length-4])                   // i = newWords.length-4                (3)
         * learn
         * speak
         * healthy      sout(newWords[])     // last-value i = 0   (newWords.length-1, newWords.length-2, newWords.length-4, newWords.length-3,....0)

            *
            * int i = newWords.length-1 ; i >= 0 ; i--
            *
            *
            *

         */
        System.out.println("\n -- reverse order AGAIN");
        for (int i = newWords.length-1 ; i >= 0 ; i--) {
            System.out.println(newWords[i]);
        }

        /**
         * Practice questions:
         * Q1. print the values index even index-values
         * Q2. print the values which starts with h or l
         * Q3. print the values which has length more than 5
         * Q4. print the values which has length greater than 5 and starts with l
         */



    }

}
