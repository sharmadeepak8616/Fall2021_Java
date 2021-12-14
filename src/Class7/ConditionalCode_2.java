package Class7;

public class ConditionalCode_2 {
    public static void main(String[] args) {

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
         * Syntax if-elseif-else block
         *
         * if (condition(s)) {
         *      // if block
         *      // code will execute when condition(s) is/are true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code will execute when condition(s) is/are true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code will execute when condition(s) is/are true
         * } else {
         *      // else-block
         *      // code will execute if all above if/else-if condition(s) are false
         * }
         *
         */

        /**
         *
         * number is divisible by 2 and number < 10
         *      sout(number x 10)
         *      sout("number is divisible by 2")
         * number is divisible by 5 or number is divisible by 7
         *      sout("number is divisible by 5 or 7")
         *      sout(number x 20)
         * number < 20
         *      sout("number is less than 20");
         *
         */
        int number = 35;

        if (number%2 == 0 && number < 10) {
            System.out.println(number + " x 10 = " + number*10);    // 2 x 10 = 20
            System.out.println(number + " is divisible by 2");      // 2 is divisible by 2
        } else if (number%5 == 0 || number%7 == 0) {
            System.out.println(number + " is divisible by 5 or 7");      // 2 is divisible by 5 or 7
            System.out.println(number + " x 20 = " + number*20);         // 2 x 20 = 40
        } else if (number < 20) {
            System.out.println(number + " is less than 20");
        } else {
            System.out.println("All above conditions failed");
        }

        System.out.println("Out side the if-else block");


        /**
         * switch block
         *
         * 1. all conditions are related to one variable
         * 2. all conditions are checking the equals-check
         * 3. for every block there is one condition and that should be checking equals
         *
         * syntax:
         *
         * switch (variable) {
         *      case value1:
         *          // do this
         *          // code to execute when variable-value is equals/identical to value1
         *          break;
         *      case value2:
         *          // do this
         *          // code to execute when variable-value is equals/identical to value2
         *          break;
         *      case value3:
         *          // do this
         *          // code to execute when variable-value is equals/identical to value3
         *          break;
         *      default:
         *          // do this
         *          // code to execute when variable-value is NOT equals/identical to above mentioned values
         * }
         *
         *
         *
         */
        int num = 5;
        /*
            if num = 2 , print (num is two)
            if num is equal to 5, print "num is five")
            if num is equal to 15, print "num is fifteen")
            if num is equal to 10, print "num is ten")
            if num is equal to 20, print "num is twenty")
         */
        if (num == 2) {
            System.out.println("num is two");
        } else if (num == 5) {
            System.out.println("num is five");
        } else if (num == 15) {
            System.out.println("num is fifteen");
        } else if (num == 10) {
            System.out.println("num is ten");
        } else if (num == 20) {
            System.out.println("num is twenty");
        }

//        if (num == 2) {
//            System.out.println("num is two");
//        }
//        if (num == 5) {
//            System.out.println("num is five");
//        }
//        if (num == 15) {
//            System.out.println("num is fifteen");
//        }
//        if (num == 10) {
//            System.out.println("num is ten");
//        }
//        if (num == 20) {
//            System.out.println("num is twenty");
//        }
        /*
         * 1. all conditions are related to one variable - yes
         * 2. all conditions are checking the equals-check - yes
         * 3. for every block there is one condition and that should be checking equals - yes
         */
        switch (num) {
            case 2:
                System.out.println("num is two");
                break;
            case 5:
                System.out.println("num is five");
                break;
            case 15:
                System.out.println("num is fifteen");
                break;
            case 10:
                System.out.println("num is ten");
                break;
            case 20:
                System.out.println("num is twenty");
                break;
        }

        /*
            if name is happy, print "good name"
            if name is joy, print the name and it's length.
                            print "your name is too short"
            if name is john, print name is uppercase
            if name is not from above list, print "you have different name than we expected"
         */
        /*
         * 1. all conditions are related to one variable - yes (name)
         * 2. all conditions are checking the equals-check - yes
         * 3. for every block there is one condition and that should be checking equals - yes
         */
        String name = "jOy";

        switch (name.toLowerCase()) {
            case "happy":
                System.out.println("Good name");
                break;
            case "joy":
                System.out.println(name);
                System.out.println(name.length());
                System.out.println("your name is too short");
                break;
            case "john":
                System.out.println(name.toUpperCase());
                break;
            default:
                System.out.println("you have different name than we expected");
        }

        /*
            day

            if day is Mon -> print ("Today is the Technosoft class")
            if day is Wed -> print ("Today is the Technosoft class")
            if day is Fri -> print ("Today is the Technosoft class")
            if day is tue -> print ("Today is self learning day")
            if day is Thu -> print ("Today is self learning day")
            if day is Sat -> print ("Today is lab session day")
            if day is sun -> print ("No study today")
            Note: if day value is not valid -> print an error saying "Entered day-value is not valid"

            User can provide day-name is any form, Mon or Monday or MONDAY or MoN

         */
        /*
         * 1. all conditions are related to one variable - yes
         * 2. all conditions are checking the equals-check - yes
         * 3. for every block there is one condition and that should be checking equals - yes
         */
        String day = "";    // mon, MonDYA, MONDAY, MonDaY
        if (day.equalsIgnoreCase("mon")
                || day.equalsIgnoreCase("monday")
                || day.equalsIgnoreCase("wed")
                || day.equalsIgnoreCase("wednesday")
                || day.equalsIgnoreCase("fri")
                || day.equalsIgnoreCase("friday")) {
            System.out.println("Today is the Technosoft class");
        } else if (day.equalsIgnoreCase("tue")
                || day.equalsIgnoreCase("tuesday")
                || day.equalsIgnoreCase("thu")
                || day.equalsIgnoreCase("thursday")) {
            System.out.println("Today is self learning day");
        } else if (day.equalsIgnoreCase("sun")
                || day.equalsIgnoreCase("sunday")) {
            System.out.println("No study today");
        } else {
            System.out.println("Entered day-value is not valid");
        }

        switch (day.toLowerCase()) {
            case "mon":
            case "monday":
            case "wed":
            case "wednesday":
            case "fri":
            case "friday":
                System.out.println("Today is the Technosoft class");
                break;
            case "tue":
            case "tuesday":
            case "thu":
            case "thursday":
                System.out.println("Today is self learning day");
                break;
            case "sun":
            case "sunday":
                System.out.println("No study today");
                break;
            default:
                System.out.println("Entered day-value is not valid");
        }















    }
}
