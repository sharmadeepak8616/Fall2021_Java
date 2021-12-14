package Class4;

public class String_Concept {
    public static void main(String[] args) {

        /**
         * String: is a non-primitive datatype.
         * can store single or multiple characters
         *
         * value must be enclosed in double-quote while storing in the String-variable.
         *
         * --> String is a Class
         *
         */

        String cityName = "nEW yORk CIty";
        /**
         * start index = 0
         * last index = 12
         * length = 13
         *
         * "Happy"
         * start index = 0
         * last index = 4
         * length = 5
         *
         * index-value is ALWAYS int
         * lastIndex is always length-1
         * lastIndex = length - 1
         *
         */
        System.out.println("city name : " + cityName);

        /**
         * To find the length of a String
         * method: length()
         * return type: int
         */
        int cityNameLength = cityName.length();
        System.out.println("\nLength of '" + cityName + "' is : " + cityNameLength);

        /**
         * To convert String value into lowercase
         * method: toLowerCase()
         * return type: String
         *
         * This method does not change the value in original variable.
         * It will convert the value in lowercase, and return the result
         */
        String cityName_Lowercase = cityName.toLowerCase();
        System.out.println("\ncity name : " + cityName);
        System.out.println("city name in lowercase: " + cityName_Lowercase);

        /*
            convert value in lowercase and store result in NEW variable

            String cityName_Lowercase = cityName.toLowerCase();
            System.out.println("\ncity name : " + cityName);     // value will stay as it was earlier
            System.out.println("city name in lowercase: " + cityName_Lowercase);

         */

        /*
            convert value in lowercase and store result in SAME variable

            cityName = cityName.toLowerCase();
            System.out.println("\ncity name : " + cityName);     // value will be in lowercase

         */


        /**
         * To convert String value into uppercase
         * method: toUpperCase()
         * return type: String
         *
         * This method does not change the value in original variable.
         * It will convert the value in uppercase, and return the result.
         */
        String cityName_Uppercase = cityName.toUpperCase();
        System.out.println("\ncity name : " + cityName);
        System.out.println("city name in uppercase: " + cityName_Uppercase);

        String name = "UnITED StaTeS of AmerICA 123";

        System.out.println(name.toLowerCase());     // united states of america 123

        System.out.println(name.toUpperCase());     // UNITED STATES OF AMERICA 123

        System.out.println(name);                   // UnITED StaTeS of AmerICA 123





















    }
}
