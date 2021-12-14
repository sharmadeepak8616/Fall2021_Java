package Class19.LabSession;

import java.util.*;

public class Lab_Deepak {
    public static void main(String[] args) {

        /**
         * Homework - question-1
         * Encapsulation
         *
         * CT Polymorphism
         *
         * Interface vs Abstract Class
         * Map
         * Set
         *
         * Loop condition
         */

//        List<String> words = List.of(new String[]{"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"});
//        HashMap<String, Integer> repeatWords = new HashMap<String, Integer>();
//
        ArrayList<String> groceryList = new ArrayList<>();

        Set<String> grocerySet = new HashSet<>();

        // 50, 55, 50, 60, 45
        // child1, child2, child3, child4, child5

        // child1-50 , child2-55
        /*
            child1(key)  50(value)
            child2  55
            child3  50
         */
        Map<String, Integer> weightTracker = new HashMap<>();
        weightTracker.put("Child1", 50);


        /**
         *
         * Question-1:
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         *
         * Create method that will print the keys with same value
         *
         * Input to method -> [ {101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"} ]
         * Output (print) ->
         *      "happy" is present with 101, 103, 106 keys
         *      "peace" is present with 102, 105 keys
         *
         * Input to method -> [ {111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"} ]
         * Output (print) ->
         *
         * Set<Integer> duplicates = new HashSet<>();
         * 101, 102, 103, 104, 105, 106
         *
         * 101
         *      String v101 = value for 101
         *      String val = value for 102
         *      if (v101 equalIgnoreCase val)
         *          store 101 and 102 in duplicates
         *      String val = value for 103
         *      if (v101 equalIgnoreCase val)
         *          store 101 and 103 in duplicates
         *      String val = value for 104
         *      if (v101 equalIgnoreCase val)
         *          store 101 and 104 in duplicates
         *      ...
         *      ...
         * 102
         *      String v102 = value for 102
         *      String val = value for 103
         *      if (v102 equalIgnoreCase val)
         *          store 102 and 103 in duplicates
         *      String val = value for 104
         *      if (v102 equalIgnoreCase val)
         *          store 102 and 104 in duplicates
         *
         *
         */

        String[] words = {"happy", "peace", "joy", "grow", "joy"};
        /*
            happy   word[0]
            peace   word[1]
            joy
            grow
            joy     word[4]

            word[i]     // 0,1,2...4    (words.length - 1) i=0     i<=words.length-1    i++

            for (int i=0 ; i <= words.length - 1 ; i++) {
                // code
            }
         */

        /*
            joy     words[4]
            grow    words[3]
            joy
            peace
            happy   words[0]

            words[i]    // i=4,3,2...0 ; i>=0 ; i--

            for (int i=words.length-1 ; i>=0 ; i--) {
                sout(words[i]);
            }
         */


        List<String> words1 = Arrays.asList(new String[]{"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"});
        HashMap<String, Integer> repeatWords = new HashMap<String, Integer>();

    }

    // add method to say hello
    public void greeting(int number, String user) {
        System.out.println("Hello " + user);
    }

    // add method to say Hi
    public void greeting(String username, int num) {
        System.out.println("Hi " + username);
    }


}
