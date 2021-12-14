package Class9;

public class Homework6_Discussion {
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

        /**
         * Q2:
         * Change the given sentence in titlecase
         *
         * HappY nEW YEAR to YoU dEAr -> Happy New year To You Dear
         * gooD morNING -> Good Morning
         * make AMERICA GreAT AgAIn -> Make America Great Again
         *
         */

        /**
         * Q3:
         * Reverse a String
         *
         * Learn -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         *
         */
        /*
            Very good morning  ->
                split(" ")   ->  String[] abc = "Very" "good" "morning"  ->

                String[] abc = "Very" "good" "morning"

                sout(abc[abc.length-1])                          //  sout(value present at last-index in abc)
                sout(abc[abc.length-2])                          //  sout(value present at second-last-index in abc)
                ...
                ...
                sout(abc[abc.length-abc.length])                  //  sout(value present at index-0 in abc)

                -> sout(abc[abc.length-i])     i=1,2,3....abc.length


                for (int i=1 ; i <= abc.length ; i++) {
                    sout(abc[abc.length-i]);
                }
         */

        String q3 = "happy birthday to you";

        String[] q3Array = q3.split(" ");   // "happy", "birthday", "to", "you"

        System.out.println(q3.toUpperCase());     // HAPPY BIRTHDAY TO YOU

        char letter = q3.charAt(1);


        String ttext = "maKe ameriCa gReat aGaiN";
        String[] split = ttext.trim().split("");
        String s = "";
        for(
                int i = 0;
                i <=split.length -1;i++)

        {
            s = s + split[i].toUpperCase().charAt(0);
        }
        System.out.println(s);




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
        String r = reverse ("learn more");
        System.out.println(r);

    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int letterIndex = 0;

        for(int i = s.length() - 1; i >=0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;

        }
        String reverse = "";
        for (int i1=0; i1 < s.length(); i1++) {
            reverse = reverse + letters[i1];

        }
        return reverse;
    }
}
