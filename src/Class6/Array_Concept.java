package Class6;

import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {

        /**
         * Array: It is a non-primitive datatype, which can store multiple values of SAME datatype
         */

        String friend1 = "abcd";
        String friend2 = "defg";
        String friend3 = "wxyz";

        friend1 = "king";

        // friends = ["abcd" , "defg" , "wxyz"]

        /**
         * Things to know before creating an Array:
         * 1. What will be the datatype of values that I want to store in array.
         * 2. a) Total number of values that I want to store in array
         *      OR
         *    b) All the values that I want to store in array
         *
         * Syntax to create an array:
         * if 1 and 2a:
         *      datatype[] arrName = new datatype[totalNumber];     // will create an empty array to store totalNumber values.
         *
         * if 1 and 2b:
         *      datatype[] arrName = {value1, value2, value3, value4, value5};
         *
         *
         */

        // Store top-5 profit making companies of 2021 (String[] to store values/companyNames)
        // "", "", "", "", ""
        /*
            1. String
            2. 5
         */
        String[] top5Companies2021 = new String[5];
        // Array -> [    ,    ,    ,    ,    ]
        // Index ->   0     1    2    3    4

        top5Companies2021[0] = "Tesla";
        // Array -> [ "Tesla" ,    ,    ,    ,    ]
        // Index ->      0      1    2    3    4

        top5Companies2021[3] = "Apple";
        // Array -> [ "Tesla" ,    ,    , "Apple"   ,    ]
        // Index ->      0      1    2      3           4

        top5Companies2021[1] = "Google";
        // Array -> [ "Tesla" , "Google"   ,    , "Apple"   ,    ]
        // Index ->      0          1         2      3         4

        top5Companies2021[2] = "Amazon";
        // Array -> [ "Tesla" , "Google"   , "Amazon"   , "Apple"   ,    ]
        // Index ->      0          1         2              3         4

        top5Companies2021[4] = "Meta";
        // Array -> [ "Tesla" , "Google"   , "Amazon"   , "Apple"   , "Meta"]
        // Index ->      0          1         2              3          4

        top5Companies2021[1] = "Technosoft";
        // Array -> [ "Tesla" , "Technosoft"   , "Amazon"   , "Apple"   , "Meta"]
        // Index ->      0          1               2            3          4

        // print all top-5 company names
        System.out.println(Arrays.toString(top5Companies2021));

        // Print the most profitable company name   (Tesla)
        // print the value of any index
        System.out.println(top5Companies2021[0]);   // top5Companies2021[0] <-> represents the value at index-0 in top5Companies2021-Array

        // Print true if most profitable company name is tesla else false
        String topCompany = top5Companies2021[0];   // topCompany =
        // check value in topCompany is tesla or not --> useful:
        boolean isTesla = topCompany.equalsIgnoreCase("tesla");
        System.out.println("is tesla most profitable: " + isTesla);

        System.out.println("is tesla most profitable: " + top5Companies2021[0].equalsIgnoreCase("tesla"));




        /**
         * To retrieve the value from a specific index in an Array
         *
         * arrName[indexValue] <-> represents the value at index mentioned in the square-bracket.
         */

        /*
            bill1 = 100.0
            bill2 = 90.92
            bill3 = 60
            bill4 = 65.98
            bill5 = 231.78
            bill6 = 67.09

            1. double
            2b.
         */
        double[] bills = {100, 90.92, 60, 65.98, 231.78, 67.09};
        // Array -> [ 100 ,  90.92 ,  60   ,  65.98   , 231.78,   67.09]
        // Index ->    0      1        2       3          4         5

        // Print total amount spent
        double totalBills = bills[0] + bills[1] + bills[2] + bills[3] + bills[4] + bills[5];
        System.out.println("\ntotal bill : " + totalBills);


        // Store value at index-2 from bills in new variable(dunkin)
        double dunkin = bills[2];

        // find the average of all bill amounts.
        /*
            find total
            divide total by count
         */
        double myTotal = bills[0] + bills[1] + bills[2] + bills[3] + bills[4] + bills[5];

        /**
         * To length of array
         *
         * length <-- In array, length is a VARIABLE not method.
         */
        int totalNumberOfBills = bills.length;

        double billsAverage = myTotal/totalNumberOfBills;

        System.out.println("billsAverage = " + billsAverage);






    }
}
