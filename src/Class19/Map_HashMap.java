package Class19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        /**
         * Array, List, Set
         * How many value I can store at any given index? -> 1
         *
         * Map
         * How many value I can store at any given index? -> 1-pair
         *
         * Data of tempValues and stateNames
         * List<Double> = [23.3, 45,4, 70.0, 33.5];
         * List<String> = [NY, NJ, PA, CA]
         *
         * [(NY - 23.3) , (NJ - 45.4) , (PA - 70.0), (CA - 33.5)]
         *
         *
         *
         * List<Integer> ids = [1, 2, 3, 4, 5]
         * List<String> names = ["Deepak", "Imam", "Niki" , "Philip"]
         *
         * [(1 - Deepak) , (2 - Imam) , (3 - Niki) , (4 - Philip)]
         *
         * Store every student's score for 4 subjects in a variable
         * [90, 98, 87, 67]
         * [89, 76, 89, 90]
         * [98, 98, 97, 90]
         *
         * studentsId = 1, 2, 3
         *
         * 1 - [90, 98, 87, 67] , 2 - [89, 76, 89, 90] , 3 - [98, 98, 97, 90]
         *
         *
         * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
         *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
         *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
         *             "green", "green"};
         *
         * Find out how many times every color is appearing the array.
         * "green" - 7
         * "red" - 8
         * "blue" - 3
         * "yellow" - 7
         *
         * ("green" - 7) , ("red" - 8) , ("blue" - 3) , ("yellow" - 7)
         */

        /**
         * Map/HashMap: It is non-primitive datatype which can store multiple pair of values
         * --> HashMap DOES NOT maintain the order of insertion
         * because, HashMap uses HASHING technique to store the data in memory.
         *
         * Map can store a (key-value) pair in every index
         *
         * { (key1 -> val1) , (key2 -> val2) , (kay3 -> val3) , (key4 -> val4) }
         *
         * --> using the key, we can get the corresponding value.
         * --> Key is always UNIQUE in a Map.
         *
         * Syntax to Map/HashMap:
         * HashMap<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         *      OR
         * Map<keyDatatypeClass, valueDatatypeClass> myMap = new HashMap<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatype.
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         */

        /**
         * Examples of creating different Map/HashMap
         *
         * Data of tempValues and stateNames
         * List<Double> = [23.3, 45.4, 70.0, 33.5];
         * List<String> = [NY, NJ, PA, CA]
         *
         * state = key
         * temp = value
         * Map<String, Double> tempMap = new HashMap<>();
         *
         *
         * List<Integer> ids = [1, 2, 3, 4, 5]
         * List<String> names = ["Deepak", "Imam", "Niki" , "Philip", "Lily"]
         * Map<Integer, String> studentMap = new HashMap<>();
         *
         *
         * Store every student's score for 4 subjects in a variable
         * [90, 98, 87, 67] -> List<Integer>        ( 1 - [90, 98, 87, 67] , 2 - [89, 76, 89, 90])
         * [89, 76, 89, 90] -> Integer[]
         * [98, 98, 97, 90]
         *
         * studentsId = 1, 2, 3
         * id = key
         * List<Integer> = value
         * Map<Integer, List<Integer>> studentsScore = new HashMap<>();
         *  OR
         * Map<Integer, Integer[]>> studentsScore = new HashMap<>();
         *
         */

        /**
         * Store data of ssn and blood group
         * key = ssn (String)
         * value = blood group (String)
         */
        // Map<Integer, String> bloodGroupData = new HashMap<>();
        Map<String, String> bloodGroupData = new HashMap<>();

        /**
         * To find length of Map/HashMap
         * Method: size()
         * return type: int
         */
        System.out.println("bloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To add pair in Map/HashMap
         * method: put
         */
        bloodGroupData.put("1111", "AB+");
        bloodGroupData.put("1112", "B-");
        bloodGroupData.put("1113", "AB-");
        bloodGroupData.put("1114", "O-");
        bloodGroupData.put("1115", "B+");
        bloodGroupData.put("1116", "AB+");
        bloodGroupData.put("1117", "B+");
        bloodGroupData.put("1118", "A+");
        bloodGroupData.put("1111", "A-");
        bloodGroupData.put("1119", "A+");
        bloodGroupData.put("1120", "AB-");

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To remove a pair from Map/HashMap
         * method: remove()
         *
         * usage:
         * 1. by providing the key-value for the pair you want to remove
         * 2. by providing the exact pair that you want to remove
         */
        /**
         * is using remove method as #1: by providing the key-value for the pair you want to remove
         *
         * if the given key is found
         *      java will remove the pair and return the associated value
         * else
         *      return null
         */
        String valueWith_1119 = bloodGroupData.remove("1119");
        System.out.println("\nRemoved '1119', value associated with '1119' -> " + valueWith_1119);

        String valueWith_1110 = bloodGroupData.remove("1110");
        System.out.println("Removed '1110', value associated with '1110' -> " + valueWith_1110);

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * is using remove method as #2: by providing the exact pair that you want to remove
         *
         * if the exact pair is found
         *      java will remove the pair and return true
         * else
         *      java will return false
         *
         */
        boolean is_1110PairRemoved = bloodGroupData.remove("1110","B+");
        System.out.println("\nis (1110,B+) removed? : " + is_1110PairRemoved);  // false

        boolean is_1114PairRemoved = bloodGroupData.remove("1114","o-");
        System.out.println("is (1114,o-) removed? : " + is_1114PairRemoved);    // false

        boolean is_1113PairRemoved = bloodGroupData.remove("1113","AB-");
        System.out.println("is (1113,AB-) removed? : " + is_1113PairRemoved);   // true

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To get the value associated with a key
         * method: get()
         *
         * if the key is found
         *      java will return the associated value
         * else
         *      java will return null
         *
         */
        String valueWith_1118 = bloodGroupData.get("1118");
        System.out.println("\nValue with key-1118 is : " + valueWith_1118);

        String valueWith_5555 = bloodGroupData.get("5555");
        System.out.println("Value with key-5555 is : " + valueWith_5555);

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To find if a particular data is present as one of the keys
         * method: containsKey()
         * return type: boolean
         *
         * if the given data is present as one of the keys
         *      java returns true
         * else
         *      java returns false
         *
         */
        boolean is1118PresentAsKey = bloodGroupData.containsKey("1118");
        System.out.println("\nis 1118 present as key? : " + is1118PresentAsKey);    // true

        boolean isAPresentAsKey = bloodGroupData.containsKey("A+");
        System.out.println("is A+ present as key? : " + isAPresentAsKey);       // false

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To find if a particular data is present as one of the values
         * method: containsValue()
         * return type: boolean
         *
         * if the given data is present as one of the values
         *      java returns true
         * else
         *      java returns false
         */
        boolean isAPresentAsValue = bloodGroupData.containsValue("A");
        System.out.println("\nis A present as values? : " + isAPresentAsValue);    // false

        boolean isABPresentAsValue = bloodGroupData.containsValue("AB-");
        System.out.println("is AB- present as values? : " + isABPresentAsValue);    // true

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To get all the keys from Map/HashMap in a variable
         * Method: keySet()
         * return type: Set
         */
        Set<String> allKeys = bloodGroupData.keySet();
        System.out.println("\nAll keys -> " + allKeys);     // [1118, 1117, ....]

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To get all values from Map/HashMap in a variable
         * Method: values()
         * return type:
         */
        Collection<String> allValues = bloodGroupData.values();
        System.out.println("\nAll values -> " + allValues);

        System.out.println("\nbloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To find if Map/HashMap is empty
         * Method: isEmpty()
         * return type: boolean
         */
        boolean isMapEmpty = bloodGroupData.isEmpty();
        System.out.println("\nis bloodGroupData empty? : " + isMapEmpty);
        System.out.println("bloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());

        /**
         * To clear/erase all data from Map/HashMap
         * method: clear
         */
        System.out.println("\nClearing the bloodGroupData-HashMap");
        bloodGroupData.clear();

        boolean isMapEmpty_AfterClear = bloodGroupData.isEmpty();
        System.out.println("\nAfter clear; is bloodGroupData empty? : " + isMapEmpty_AfterClear);
        System.out.println("bloodGroupData -> " + bloodGroupData);
        System.out.println("bloodGroupData size -> " + bloodGroupData.size());


    }
}
