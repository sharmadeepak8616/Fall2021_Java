package Class5;

public class String_Concept_2 {
    public static void main(String[] args) {


        String cityName = "nEW yORk CIty";
        /**
         * For comparison, when we need to verify if two strings are IDENTICAL.
         * method: equals()
         * return type: boolean
         *
         * if two strings are identical, equals() methods returns true
         * else false.
         *
         * "New York"
         * "New York"
         *
         */
        String cityName2 = "New York City";

        boolean isEqual = cityName.equals(cityName2);
        System.out.println("is '" + cityName + "' equals to '" + cityName2 + "'? : " + isEqual);

        /**
         * For comparison, when we need to verify if two strings are having SAME value (ignoring the cases).
         * method: equalsIgnoreCase()
         * return type: boolean
         *
         * if two strings are having same value, equalsIgnoreCase() methods returns true
         * else false.
         *
         * "nEW yORk CIty"
         * "New York City"
         *
         */

        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityName2);
        System.out.println("\nis '" + cityName + "' equals (ignore case) to '" + cityName2 + "'? : " + isEqualIgnoreCase);

        /**
         * To find if a particular sequence is EXACTLY present in the given string
         * method: contains()
         * input: String
         * return type: boolean
         *
         *
         * "nEW yORk CIty"
         * "new"
         *
         * false
         *
         */
        // cityName = "nEW yORk CIty"
        boolean isContains_new = cityName.contains("new");
        System.out.println("\nis '" + cityName + "' contains 'new'? : " + isContains_new);


        /**
         * Task: verify if cityName ("nEW yORk CIty") contains "New YORK"
         * Note: pls ignore the cases
         * Expected result: true
         */
        String checkFor = "New YORK";
        /*
            -- Pseudo Coding --
            convert cityName into Uppercase (NEW YORK CITY)
            convert checkFor into Uppercase (NEW)
            Apply contains method on cityName_U with checkFor_U -> true
         */
        String cityName_Uppercase = cityName.toUpperCase();
        checkFor = checkFor.toUpperCase();
        boolean isContains = cityName_Uppercase.contains(checkFor);

        boolean isContains2 = cityName.toUpperCase().contains(checkFor.toUpperCase());

        System.out.println("is '" + cityName + "' contains '" + checkFor + "' (ignoring cases)? : " + isContains);
        System.out.println("is '" + cityName + "' contains '" + checkFor + "' (ignoring cases)? : " + isContains2);

        /**
         * To replace a String in a given String
         * method: replace()
         * input: String, String
         * return type: String
         *
         * "New York City"
         * replace "e" with "f"
         * "Nfw York City"
         *
         * It will replace all valid instances.
         * This method does not change the value in original variable.
         * It will replace the value in the given String, and return the result.
         *
         */
        String news = "Health was Earlier said to Be the ability of the body functioning WElL. Health was Earlier said to Be...";
        // replace all e from news with XXX
        String newsReplace_e_XXX = news.replace("e", "XXX");

        System.out.println("\nAfter replace -> " + newsReplace_e_XXX);
        System.out.println("Original news -> " + news);

        /**
         * Pls replace all instances of e/E with XXX
         */
        /*
            Pseudo Coding
            convert news into lowercase
            convert replaceThis into lowercase
            replace all e with XXX
         */
        String replaceThis = "E", replaceWith = "XXX";
        String newsLowercase = news.toLowerCase();
        String replaceThisLowercase = replaceThis.toLowerCase();
        String newsReplace = newsLowercase.replace(replaceThisLowercase, replaceWith);
        System.out.println(newsReplace);

        /**
         * To find the char present at a particular index
         * method: charAt()
         * input: int
         * return type: char
         *
         * If the given index is within the index-range, it will return the char at given index
         * else, it will throw Exception (StringIndexOutOfBoundsException)
         *
         *
         */
        // cityName = "nEW yORk CIty"   length=13   (lastIndex = length - 1)
        char charAtIndex4 = cityName.charAt(4);
        System.out.println("\nchar at index-4 in '" + cityName + "' is: " + charAtIndex4);    // y

        // char charAtIndex13 = cityName.charAt(13);
        // System.out.println("char at index-13 in '" + cityName + "' is: " + charAtIndex13);    //

        /**
         * Task: Write code to print the char at last index of given String
         */
        String taskString = "Health was Earlier said to Be the ability of the body functioning WElL.";  // .
        /*
            1. find length  (length())
            2. find last index (using length -1)
            3. charAt to find char at last index
         */
        int taskStringLength = taskString.length();
        int lastIndex = taskStringLength - 1;
        char charAtLastIndex = taskString.charAt(lastIndex);
        System.out.println("char at last index in '" + taskString + "' is : " + charAtLastIndex);

        /**
         * To find the index of FIRST OCCURRENCE of a string in the given string
         * Method: indexOf()
         * input: String
         * return type: int
         *
         * "the body functioning WElL."
         * find index of b? -> 4
         *
         * find index if e? -> 2
         *
         * find index of w? -> -1
         *
         * If the given value is found in the given String
         *      will return the index of FIRST OCCURRENCE of the given value
         * else
         *      will return -1
         *
         */
        String healthString = "the body functioning WElL.";
        int indexOf_b = healthString.indexOf("b");
        System.out.println("\nIndex of 'b' in '" + healthString + "' is : " + indexOf_b);

        int indexOf_e = healthString.indexOf("e");
        System.out.println("Index of 'e' in '" + healthString + "' is : " + indexOf_e);

        int indexOf_w = healthString.indexOf("w");
        System.out.println("Index of 'w' in '" + healthString + "' is : " + indexOf_w);

        int indexOf_body = healthString.indexOf("body");
        System.out.println("Index of 'body' in '" + healthString + "' is : " + indexOf_body);

        int indexOf_n = healthString.indexOf("n");
        System.out.println("Index of 'n' in '" + healthString + "' is : " + indexOf_n); // 11


        /**
         * To find the index of LAST OCCURRENCE of a string in the given string
         * Method: lastIndexOf()
         * input: String
         * return type: int
         *
         * "the body functioning WElL."
         * find index of last occurrence of b? -> 4
         *
         * find index of last occurrence of e? -> 2
         *
         * find index of last occurrence of w? -> -1
         *
         * find index of last occurrence of n? -> 18
         *
         * If the given value is found in the given String
         *      will return the index of LAST OCCURRENCE of the given value
         * else
         *      will return -1
         *
         */
        int lastIndexOf_b = healthString.lastIndexOf("b");
        System.out.println("\nIndex of last occurrence of 'b' in '" + healthString + "' is : " + lastIndexOf_b); // 4

        int lastIndexOf_e = healthString.lastIndexOf("e");
        System.out.println("Index of last occurrence of 'e' in '" + healthString + "' is : " + lastIndexOf_e); //

        int lastIndexOf_w = healthString.lastIndexOf("w");
        System.out.println("Index of last occurrence of 'w' in '" + healthString + "' is : " + lastIndexOf_w); //

        int lastIndexOf_n = healthString.lastIndexOf("n");
        System.out.println("Index of last occurrence of 'n' in '" + healthString + "' is : " + lastIndexOf_n); //

        /**
         * To find if the string starts with a given string value
         * method: startsWith()
         * input: String
         * return type: boolean
         *
         * String abc = "new York City"
         * does abc starts with "n"? - true
         * does abc starts with "N"? - false
         *
         */
        // String cityName = "nEW yORk CIty";

        boolean isStartsWith_new = cityName.startsWith("new");
        System.out.println("\nis '" + cityName + "' starts with 'new'? : " + isStartsWith_new);     // false

        boolean isStartsWith_n = cityName.startsWith("n");
        System.out.println("is '" + cityName + "' starts with 'n'? : " + isStartsWith_n);     // true

        /**
         * To find if the String ends with a given string value
         * method: endsWith()
         * input: String
         * return type: boolean
         *
         * String abc = "new York City"
         * does abc ends with "ity"? - true
         * does abc ends with "k City"? - true
         * does abc ends with "y"? - true
         * does abc ends with "n"? - false
         */
        // String cityName = "nEW yORk CIty";
        boolean isEndsWith_ity = cityName.endsWith("Ity");
        System.out.println("\nis '" + cityName + "' ends with 'Ity'? : " + isEndsWith_ity);     // true

        boolean isEndsWith_k_City = cityName.endsWith("k CIty");
        System.out.println("is '" + cityName + "' ends with 'k CIty'? : " + isEndsWith_k_City); // true

        boolean isEndsWith_n = cityName.endsWith("n");
        System.out.println("is '" + cityName + "' ends with 'n'? : " + isEndsWith_n);            // false

        /**
         * Task: Find if cityName value ends with "ity"?
         * (Ignore case)
         *
         * String cityName = "nEW yORk CIty";
         *
         */
        /*
            String cityName = "nEW yORk CIty";
            String endsWithCheck = "ity";
            cityName into lowercase (toLowercase())         "new york city"
            endsWithCheck into lowercase (toLowercase())    "ity"
            endsWith()

         */
        String endsWithCheck = "ity";

        String endsWithCheckLower = endsWithCheck.toLowerCase();
        String cityNameLower = cityName.toLowerCase();

        boolean cityNameEnds = cityNameLower.endsWith(endsWithCheckLower);

        System.out.println("\nis '" + cityName + "' ends with '" + endsWithCheck + "'? : " + cityNameEnds);


        /**
         * To remove spaces from the beginning (before the first character in String)
         *  and from the end (after the last character in the string)
         *
         * method: trim()
         * return type: String
         *
         * This method does not change the value in original variable.
         * It will remove extra spaces, and return the result.
         *
         */

        String city = "       new nnn      city     york     my   ciy     . ";

        String cityTrim = city.trim();                      // "new nnn      city     york     my   ciy     ."

        System.out.println("\n-" + cityTrim + "-");         // -new nnn      city     york     my   ciy     .-
        System.out.println("-" + city + "-");               // -       new nnn      city     york     my   ciy     . -













    }
}
