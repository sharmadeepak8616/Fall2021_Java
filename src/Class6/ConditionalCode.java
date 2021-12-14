package Class6;

public class ConditionalCode {
    public static void main(String[] args) {

        /**
         * mon, thurs and no meeting
         *      work from home
         * any other day
         *      work from office
         *
         *
         * day = mon
         * anyMeeting = false
         *      wfh
         *
         * day = tue
         *      wfo
         *
         *
         * if you find soya-milk and it is not going to expire in 1 week
         *      buy 2 packets
         *      but 1 bread
         * otherwise, find almond milk
         *      buy 1 packet
         * otherwise
         *      call me
         *
         *
         * if it's raining
         *      take umbrella
         *
         *
         *
         * you found soya-milk and it is not going to expire in 1 week
         *      buy 2 packets
         *      but 1 bread
         *
         * you found soya-milk and it is expiring in 1 week
         * found almond-milk
         *      but 1 packet
         *
         *
         */

        /**
         * Conditional Code (Conditional Loops / Conditional Blocks)
         *
         * 1. if-else block
         * 2. switch block
         *
         * when we have different actions to do (code to execute) depending upon conditions
         *
         */

        /**
         * Syntax:
         *          if-else
         *
         * if (condition(s)) {
         *      // if block
         *      // code will execute if condition(s) is/are true
         * }
         *
         */
        String name = "United STATES OF AMERICA";

        /*
            if the value in name-variable contains "state", print the value of name-variable
         */
        if (name.toLowerCase().contains("state")) {
            System.out.println(name);
        }

        /*
            if the value in name-variable contains "state", print the value of name-variable
            otherwise print "Country name doesn't contain state"
         */

        /**
         * Syntax:
         *          if-else
         *
         * if (condition(s)) {
         *      // if block
         *      // code will execute if condition(s) is/are true
         * } else {
         *      // else-block
         *      // code will execute if all above if/else-if condition(s) are false
         * }
         *
         */
        if (name.toLowerCase().contains("state")) {
            System.out.println(name);
        } else {
            System.out.println("Country name doesn't contain state");
        }


    }
}
