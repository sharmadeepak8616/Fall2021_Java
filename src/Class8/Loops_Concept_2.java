package Class8;

public class Loops_Concept_2 {
    public static void main(String[] args) {

        /**
         * Syntax for-loop
         *
         * for (initialization ; condition ; increment ) {
         *      // code inside
         *      // for-loop
         * }
         *
         *
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
         * Q1. print the values index at even index-values
         *
         * sout(words[0])
         * sout(words[2])
         * sout(words[4])
         * ...
         * ...
         *
         * sout(words[i])   i=0,2,4,6....lastIndex
         *
         * initialization ; condition ; increment
         * int i=0  ; i <= lastIndex ; i+=2
         *
         */
        String[] words = {"healthy", "lspeak", "learning", "king", "Joy", "smile", "learn", "living" , "give", "living standard", "life"};

        for (int i=0  ; i <= words.length-1 ; i+=2) {
            System.out.println(words[i]);
        }

        /**
         * i=0
         * check if i-value is even
         *      print value at words[i]
         * i=1
         * check if i-value is even
         *      print value at words[i]
         * i=2
         * check if i-value is even
         *      print value at words[i]
         * i=3
         * check if i-value is even
         *      print value at words[i]
         *
         *
         * i=0,1,2,3,...lastIndex
         * check if i-value is even
         *      print value at words[i]
         *
         */
        for (int i=0 ; i <= words.length-1 ; i++) {
            if (i%2 == 0) {
                System.out.println(words[i]);
            }
        }

        /**
         *
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
         * Q4. print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         * if (words[0].length > 5 && words[0].startsWith("l")) {
         *      sout(words[0])
         * }
         * if (words[1].length > 5 && words[1].startsWith("l")) {
         *      sout(words[1])
         * }
         * if (words[2].length > 5 && words[2].startsWith("l")) {
         *      sout(words[2])
         * }
         * ...
         * ...
         * if (words[lastIndex].length > 5 && words[lastIndex].startsWith("l")) {
         *      sout(words[lastIndex])
         * }
         *
         *
         * if (words[i].length > 5 && words[i].startsWith("l")) {       // i=0,1,2,3...lastIndex  i++
         *      sout(words[i])
         * }
         */
        System.out.println("\nQ4 - results:");
        for (int i=0 ; i <= words.length-1 ; i++) {
            if (words[i].length() > 5 && words[i].startsWith("l")) {
                System.out.println(words[i]);
            }
        }

        int[] numbers = {90, 89, 78, 76, 35, 78};
        /*
            find the average of array

            sum of values in array / total number of values

            total = words[0];


            90.0+89=179.0   (total = total + words[1])  // i=1,2,3,....lastIndex i++
            179+78=257  (total = total + words[2])
            257+76=333  (total = total + words[3])
            333+35=368  (total = total + words[4])
            368+78=446  (total = total + words[5])      // total = 446

            446.0/6 =

         */
        double total = numbers[0];  // total = 90.0

        for (int i=1 ; i <= numbers.length-1 ; i++) {
            // total = total + numbers[i];
            total+=numbers[i];
        }
        System.out.println(total/numbers.length);


        /**
         * Enhanced for-loop (with Array/Collections)
         *
         * Conditions in which you have option to use Enhanced for-loop
         *  1. need to traverse an array (or Collections)
         *  2. you need to traverse array-values one-by-one from index-0 to last-index
         *
         *
         * Syntax:
         * for (datatype varName : arrName) {
         *      // code inside the for-loop
         * }
         *
         * when loop is running for first-time -> varName = arrName[0]
         * when loop is running for second-time -> varName = arrName[1]
         * ...
         * when loop is running for last-time -> varName = arrName[lastIndex]
         *
         */
        /**
         *
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
         * Q4. print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         * if (words[0].length > 5 && words[0].startsWith("l")) {
         *      sout(words[0])
         * }
         * if (words[1].length > 5 && words[1].startsWith("l")) {
         *      sout(words[1])
         * }
         * if (words[2].length > 5 && words[2].startsWith("l")) {
         *      sout(words[2])
         * }
         * ...
         * ...
         * if (words[lastIndex].length > 5 && words[lastIndex].startsWith("l")) {
         *      sout(words[lastIndex])
         * }
         *
         *
         * if (words[i].length > 5 && words[i].startsWith("l")) {       // i=0,1,2,3...lastIndex  i++
         *      sout(words[i])
         * }
         */
        System.out.println("\nQ4 - results:");
        for (int i=0 ; i <= words.length-1 ; i++) {
            if (words[i].length() > 5 && words[i].startsWith("l")) {
                System.out.println(words[i]);
            }
        }
        /*
         * for (datatype varName : arrName) {
         *      // code inside the for-loop
         * }
         */
        for (String word : words) {     // word = words[0]
            if (word.length() > 5 && word.startsWith("l")) {
                System.out.println(word);
            }
        }

        double[] accountBalances = {11, 22, 33};
        /*
            If account balance is less than 1000, print the index of accountBalance and it's value

            expected ans:
                Account balance less than 1000:
                Balance amount: 78

            sout("Account balance less than 1000:");
//......loop starts
            accountBalance[0] < 1000
                sout("Balance amount: " + accountBalance[0])

            accountBalance[1] < 1000
                sout("Balance amount: " + accountBalance[1])
                ...
                ...
                ...
            accountBalance[lastIndex] < 1000
                sout("Balance amount: " + accountBalance[lastIndex])



            accountBalance[i] < 1000            // i=0,1,2,3...lastIndex
                sout("Balance amount: " + accountBalance[i])
                sout("Balance index: " + i)

         */
        System.out.println("-- for loop --");
        for (int i=0 ; i <= accountBalances.length-1 ; i++) {
            if (accountBalances[i] < 1000) {
                System.out.println("Balance amount: " + accountBalances[i]);
            }
        }
        System.out.println("-- Enhanced for loop --");
        for (double balance : accountBalances) {
            if (balance < 1000) {
                System.out.println("Balance amount: " + balance);
            }
        }

        /**
         * while loop
         *
         * initialization
         * while (condition) {
         *      // until the condition is true
         *      // run the code inside loop
         *      increment/decrement
         * }
         *
         */
        System.out.println("-- while loop --");
        int index=0;
        while (index <= accountBalances.length-1) {
            if (accountBalances[index] < 1000) {
                System.out.println("Balance amount: " + accountBalances[index]);
            }
            index++;
        }

        /**
         * do-while loop
         *
         * initialization
         * do {
         *      // until the condition is true
         *      // run the code inside the loop
         *      increment/decrement
         * } while (condition);
         *
         *
         * code inside the do-while loop will always run atleast once.
         * For first execution of do-while, it will not check the condition;
         *  whereas for/while loop checks the condition from first execution
         *
         */
        System.out.println("-- do-while loop --");
        int doIndex=0;
        do {
            if (accountBalances[doIndex] < 1000) {
                System.out.println("Balance amount: " + accountBalances[doIndex]);
            }
            doIndex++;
        } while (doIndex <= accountBalances.length-1);


        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        /*
            Print the letters from array as below:
            Letter at index-0 : a
            Letter at index-1 : b
            Letter at index-2 : c
            ...
            ...


            Letter at index-0 : letters[0]
            Letter at index-1 : letters[1]

            Letter at index-i : letters[i]  // i=0,1,2,..lastIndex      i <= letters.length-1
         */
        System.out.println("-- for loop --");
        for (int i=0 ; i <= letters.length-1 ; i++) {
            System.out.println("Letter at index-" + i + " : " + letters[i]);
        }

        System.out.println("-- while loop --");
        int w = 0;
        while ( w <= letters.length-1) {
            System.out.println("Letter at index-" + w + " : " + letters[w]);
            w++;
        }

        System.out.println("-- do-while loop --");
        int d=0;
        do {
            System.out.println("Letter at index-" + d + " : " + letters[d]);
            d++;
        } while (d <= letters.length-1);


        /**
         * Reverse a string
         *
         * "learn"
         * "nrael"
         *
         * "living standard"
         * "dradnats gnivil"
         *
         *
         * String newString = "";
         *
         * newString = newString + orgString.charAt(orgString.length() - 1) ("n")     // newString = n
         * newString = newString + orgString.charAt(orgString.length() - 2) ("r")     // newString = nr
         * newString = newString + orgString.charAt(orgString.length() - 3) ("a")     // newString = nra
         * ...
         * ...
         * newString = newString + orgString.charAt(orgString.length() - orgString.length())
         *
         *
         * sout(newString)
         *
         * lastIndex-letter
         *
         * --> charAt()
         *
         * newString = newString + orgString.charAt(orgString.length()-i)       // i=1,2,3,...length    i <= length
         *
         */
        String orgString = "living standard";
        String newString = "";
        for (int i=1 ; i <= orgString.length() ; i++) {
            // newString = newString + orgString.charAt(orgString.length() - i);
            newString += orgString.charAt(orgString.length() - i);
        }
        System.out.println("original String : " + orgString);
        System.out.println("reverse String : " + newString);


    }
}
