package Class17;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {

        /**
         *
         * Limitations of Array:
         *
         * 1. To create an array, we have to know the answer of anyone of the below questions.
         *      a) Total number of values that I want to store in array
         *          OR
         *      b) All the values that I want to store in array
         *
         * 2. Array length is fixed, we cannot increase or decrease the length of array.
         *
         * 3. Array can store ONE datatype at one time.
         *  String[] names = new String[5];             // 5 string values
         *  double[] num = new double[10];              // 10 double values
         *
         */

        /**
         * List(I) / ArrayList(C)
         *
         * ArrayList: It is a non-primitive datatype, which can store multiple values
         * --> List/ArrayList maintains the order the insertion.
         *
         * Syntax to create ArrayList:
         * ArrayList<datatypeClass> arrList = new ArrayList<>();
         *      OR
         * List<datatypeClass> myList = new ArrayList<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatype.
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         *
         * List/ArrayList is a datatype which can store multiple values
         *
         */

        // Create an array which can store names for next batch students.
        String[] names = new String[5];      // length=5
        names[0] = "Deepak";
        System.out.println("Length of names array -> " + names.length);     // Length of names array -> 5
        names[1] = "happy";
        names[2] = "lilly";
        names[3] = "king kong";
        names[4] = "learn";
        System.out.println("Length of names array -> " + names.length);     // Length of names array -> 5
        // names[5] = "grow";
        // System.out.println("Length of names array -> " + names.length);     // Length of names array ->



        // Create a List which can store names for next batch students.
        List<String> students = new ArrayList<>();      // length=0

        // Create an arrayList to store temp values.
        ArrayList<Double> arrList = new ArrayList<>();

        /**
         * to calculate length of ArrayList/List
         * method: size()
         * return type: int
         */
        int totalStudents = students.size();
        System.out.println("\nStudents -> " + students);                          // []
        System.out.println("Students ArrayList Length -> " + totalStudents);      // 0

        /**
         * To add value/data in ArrayList/List
         * method: add
         *
         * -> new data goes to the next available index
         *
         * --> using add method, we can add only 1 value at a time.
         *
         */
        students.add("Happy");          // ["Happy"]
        students.add("grow");           // ["Happy", "grow"]
        students.add("learn");          // ["Happy", "grow", "learn"]
        students.add("peaceful");       // ["Happy", "grow", "learn", "peaceful"]
        students.add("growing habit");  // ["Happy", "grow", "learn", "peaceful", "growing habit"]
        students.add("good morning");   // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning"]
        students.add("lilli vicknov");  // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov"]
        students.add("kilki");          // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov", "kilki"]
        students.add("Raji now");       // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov", "kilki", "Raji now"]
        students.add("jpw");
        students.add("Learning");
        students.add("LEARN");
        students.add("HAPPY");
        students.add("hour happy");
        students.add("Jiab haow");
        students.add("good night");
        students.add("GOOD DAY");       // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]

        System.out.println("\nStudents -> " + students);                            // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());      // 17

        /**
         * To remove a data form ArrayList/List
         * method: remove()
         *
         * usage:
         * 1. by providing the index-value from which value to be removed
         * 2. by providing the value which needs to be removed
         */
        /**
         * is using remove method as #1: by providing the index-value from which value to be removed
         *
         * if the given index is within the range ( 0 to less than length of arrayList)
         *      java will remove the value and return the removed value to user
         * else
         *      IndexOutOfBoundsException
         */
        String removedValue_1 = students.remove(1);
        System.out.println("\nRemoved value from index-1: " + removedValue_1);

        System.out.println("\nStudents -> " + students);                            // [Happy, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());      // 16

        // String removedValue_20 = students.remove(20);        // IndexOutOfBoundsException
        // System.out.println("\nRemoved value from index-20: " + removedValue_20);

        /**
         * is using remove method as #2: by providing the value which needs to be removed
         *
         * if the value is found in the ArrayList/List
         *      java will remove the FIRST occurrence of the value and returns true
         * else
         *      java will returns false
         *
         */
        boolean isRemoved_Good_morning = students.remove("Good morning");
        System.out.println("\nis 'Good_morning' removed successfully? : " + isRemoved_Good_morning);

        boolean isRemoved_kili = students.remove("kilki");
        System.out.println("is 'kikli' removed successfully? : " + isRemoved_kili);

        System.out.println("\nStudents -> " + students);                            // [Happy, learn, peaceful, growing habit, good morning, lilli vicknov, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());      // 15

        /**
         * To replace a value from a specific index
         * method: set
         *
         * if the given index is within the range ( 0 to less than length of arrayList)
         *      java will replace the old-value with new-value, and returns the old-value
         * else
         *      IndexOutOfBoundsException
         *
         */

        String replacedValue_index_1 = students.set(1, "peaceful dreams");
        System.out.println("\nReplaced value at index-1: " + replacedValue_index_1);

        System.out.println("\nStudents -> " + students);                            // [Happy, peaceful dreams, peaceful, growing habit, good morning, lilli vicknov, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());      // 15

        // String replacedValue_index_20 = students.set(20, "happily");             // IndexOutOfBoundsException
        // System.out.println("\nReplaced value at index-20: " + replacedValue_index_20);

        /*
            String[] names = new String[5];      // length=5
            names[0] = "Deepak";
            System.out.println("Length of names array -> " + names.length);     // Length of names array -> 5
            names[1] = "happy";
            names[2] = "lilly";
            names[3] = "king kong";
            names[4] = "learn";
            System.out.println("Length of names array -> " + names.length);     // Length of names array -> 5

            // get the value at index-2 from names-array (names[2]) then print it.
            sout(names[10])     <-
         */
        /**
         * To get the value from specific index
         * method: get()
         *
         * if given index is within the range ( 0 to less than length of arrayList)
         *      java will return the value at the given index
         * else
         *      IndexOutOfBoundsException
         *
         */
        // store the value at index-2 from students-ArrayList in a new variable.

        String valueAt2 = students.get(2);
        System.out.println("\nValue at index-2 : " + valueAt2);

        // String valueAt16 = students.get(16);        // IndexOutOfBoundsException
        // System.out.println("\nValue at index-16 : " + valueAt16);


        /**
         * Create ArrayList to store multiple value of multiple datatypes
         */
        List<Object> multiDataTypes = new ArrayList<>();
        multiDataTypes.add("String Value");
        multiDataTypes.add(100);
        multiDataTypes.add(true);
        multiDataTypes.add(1.1);
        multiDataTypes.add('a');

        System.out.println("\n\nmultiDataTypes -> " + multiDataTypes);

        /**
         * Create an arraylist/list to store temp values
         * 90.9, 100, 45.3, 57
         */
        List<Double> tempValues = new ArrayList<>();
        tempValues.add(90.9);
        tempValues.add(100.0);
        tempValues.add(45.3);
        tempValues.add(57.0);

        /*
            Print temp values like below:
            90.9
            100.0
            45.3
            57.0
         */
        /*
            System.out.println(tempValues.get(0));  // 90.9
            System.out.println(tempValues.get(1));  // 100.0
            System.out.println(tempValues.get(2));  // 45.3
            System.out.println(tempValues.get(3));  // 57.0
         */

        // System.out.println(tempValues.get(i));   // i=0,1,2...size-1     i++

//        for (int i=0 ; i <= tempValues.size()-1 ; i++) {
//            System.out.println(tempValues.get(i));
//        }
//
//        for (Double val : tempValues) {
//            System.out.println(val);
//        }

        // print temp values which are greater than 70
        for (int i=0 ; i <= tempValues.size()-1 ; i++) {
            if (tempValues.get(i) > 70) {
                System.out.println(tempValues.get(i));
            }
        }



    }
}
