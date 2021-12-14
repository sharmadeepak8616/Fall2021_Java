package Class19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Array {

    public static void main(String[] args) {


        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};


        /**
         * Pseudo code to find if array has duplicate values or not.
         *
         * Create a List using Array
         * Create Set using List
         * if (List.size() == Set.size())
         *      no duplicates in Array
         * else
         *      there are duplicates in Array
         */

        /*
            Create a List using Array - Method 1
         */
        List<String> words_List = new ArrayList<>();
        for (int i=0 ; i < words.length ; i++) {
            words_List.add(words[i]);
        }
        System.out.println("words_List -> " + words_List);


        /*
            Create a List using Array - Method 2
         */
        List<String> words_List2 = new ArrayList<>();

        for (String word : words) {
            words_List2.add(word);
        }
        System.out.println("words_List2 -> " + words_List2);


        /*
            Create a List using Array - Method 3
         */
        List<String> words_List3 = Arrays.asList(words);
        System.out.println("words_List3 -> " + words_List3);



    }
}
