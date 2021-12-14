package Class4;

public class JavaOperators_Ternary {
    public static void main(String[] args) {

        /**
         * Ternary (?:)
         *
         * used in situation where you want to assign value to a variable
         * depends on condition(s)
         *
         * mortgageRate = 1.5 or 2.5 depends on if your credit score is greater than 700
         *
         * mortgageRate = 1.5 or 1.8 depends on if your credit score is greater than 600 and you are first time buyer
         *
         * Syntax:
         * variable = condition(s) ? valueIfConditionsAreTrue : valueIfConditionsAreFalse
         */

        /*
            mortgageRate = 1.5 or 2.5 depends on if your credit score is greater than 700
            if creditScore > 700 is true, value of mortgageRate = 1.5 else 2.5
         */


        int creditScore = 750;
        double mortgageRate = creditScore>700?1.5:2.5;
        System.out.println("mortgage rate : " + mortgageRate);  // mortgage rate : 1.5

        creditScore = 700;
        mortgageRate = creditScore>700?1.5:2.5;
        System.out.println("mortgage rate : " + mortgageRate);  // mortgage rate : 2.5

        /*
            mortgageRate = 1.5 or 1.8 depends on if your credit score is greater than 600 and you are first time buyer
         */
        creditScore = 700;
        boolean isFirstTimeBuyer = false;

        // mortgageRate = creditScore>600 && isFirstTimeBuyer==true ? 1.5 : 1.8;
        mortgageRate = creditScore>600 && isFirstTimeBuyer ? 1.5 : 1.8;
        System.out.println("mortgage rate : " + mortgageRate);      // mortgage rate : 1.8

        /*
            isFirstTimeBuyer = false;

            isFirstTimeBuyer == true    // isFirstTimeBuyer
            false == true
            false

            isFirstTimeBuyer == false   // !isFirstTimeBuyer
            false == false
            true



            isFirstTimeBuyer = true;

            isFirstTimeBuyer == true    // isFirstTimeBuyer
            true == true
            true

            isFirstTimeBuyer == false   // !isFirstTimeBuyer
            true == false
            false

         */




    }
}
