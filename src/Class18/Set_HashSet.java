package Class18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {

        /**
         * Set/HashSet: It is non-primitive datatype which can store multiple values
         * --> Set/HashSet DOES NOT maintain the order of insertion
         * because, HashSet uses HASHING technique to store the data in memory.
         *
         * HashSet/Set vs ArrayList/List
         * 1. ArrayList/List maintains the order of insertion;
         *  HashSet/Set does NOT maintain the order of insertion.
         *
         * 2. ArrayList/List can store duplicate values;
         *  HashSet/Set does NOT store duplicate values.
         *
         * Syntax to create HashSet/Set
         * HashSet<datatypeClass> myHashSet = new HashSet<>();
         *      OR
         * Set<datatypeClass> mySet = new HashSet<>();
         *
         * datatypeClass/WrapperClass : class which represent the primitive datatype.
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         */

        // store values of different mortgage values
        Set<Double> mRates = new HashSet<>();

        /**
         * To calculate length of HashSet/Set
         * method: size()
         * return-type: int
         */
        System.out.println("\nmRates -> " + mRates);    // []
        System.out.println("mRates HashSet length -> " + mRates.size());    // 0

        /**
         * To add value/data in HashSet/Set
         * method: add()
         */
        mRates.add(1.1);
        mRates.add(2.1);
        mRates.add(2.3);
        mRates.add(1.2);
        mRates.add(2.1);
        mRates.add(2.4);
        mRates.add(0.3);
        mRates.add(9.0);
        mRates.add(4.5);
        mRates.add(3.14);

        System.out.println("\nmRates -> " + mRates);    // [1.2, 2.4, 0.3, 9.0, 4.5, 2.3, 3.14, 1.1, 2.1]
        System.out.println("mRates HashSet length -> " + mRates.size());    // 9


        /**
         * To remove a value from HashSet/Set
         * method: remove
         *
         * usage:
         * 1. by providing the value which needs to be removed
         *
         * if the value is found in the HashSet/Set
         *      java will remove the FIRST occurrence of the value and returns true
         * else
         *      java will returns false
         */
        boolean is2_1Removed = mRates.remove(2.1);
        System.out.println("\nis 2.1 removed from mRates : " + is2_1Removed);

        boolean is3_1Removed = mRates.remove(3.1);
        System.out.println("is 3.1 removed from mRates : " + is3_1Removed);

        System.out.println("\nmRates -> " + mRates);    // [1.2, 2.4, 0.3, 9.0, 4.5, 2.3, 3.14, 1.1]
        System.out.println("mRates HashSet length -> " + mRates.size());    // 8

        /**
         *  To find if a value is present in HashSet/Set
         *  method: contains()
         *
         * if the given value os present in HashSet/Set
         *      return true
         * else
         *      return false
         */
        boolean is2_2Contains = mRates.contains(2.2);
        System.out.println("\nis 2.2 contain in mRates : " + is2_2Contains);

        boolean is1_1Contains = mRates.contains(1.1);
        System.out.println("is 1.1 contain in mRates : " + is1_1Contains);

        System.out.println("\nmRates -> " + mRates);            // [1.2, 2.4, 0.3, 9.0, 4.5, 2.3, 3.14, 1.1]
        System.out.println("mRates HashSet length -> " + mRates.size());    // 8

        /**
         * To find if HashSet/Set is empty
         * method: isEmpty()
         *
         * if the HashSet/Set is empty
         *      return true
         * else
         *      return false
         */
        boolean is_mRatesEmpty = mRates.isEmpty();
        System.out.println("\nis mRates empty? : " + is_mRatesEmpty);
        System.out.println("mRates -> " + mRates);
        System.out.println("mRates HashSet length -> " + mRates.size());

        /**
         * To empty an HashSet/Set
         * method: clear()
         */
        System.out.println("\nClearing the mRates-HashSet");
        // mRates.clear();

        boolean is_mRatesEmpty_AfterClear = mRates.isEmpty();
        System.out.println("\nis mRates empty? : " + is_mRatesEmpty_AfterClear);
        System.out.println("mRates -> " + mRates);
        System.out.println("mRates HashSet length -> " + mRates.size());

        /**
         * To convert a Set into List
         */

        System.out.println("\nConverting Set into List\n");
        Set<Double> mRates2 = new HashSet<>();                  // Set = []
        mRates2.add(1.1);                                       // Set = [1.1]
        mRates2.add(2.1);
        mRates2.add(2.3);
        mRates2.add(1.2);
        mRates2.add(2.1);
        mRates2.add(2.4);
        mRates2.add(0.3);
        mRates2.add(9.0);
        mRates2.add(4.5);
        mRates2.add(3.14);

        System.out.println("mRates2_Set -> " + mRates2);                                    // [1.2, 2.4, 0.3, 9.0, 4.5, 2.3, 3.14, 1.1, 2.1]
        System.out.println("mRates2_Set length -> " + mRates2.size());                // 9

        List<Double> mRates2_List = new ArrayList<>(mRates2);
        System.out.println("mRates2_List -> " + mRates2_List);                          // [1.2, 2.4, 0.3, 9.0, 4.5, 2.3, 3.14, 1.1, 2.1]
        System.out.println("mRates2_List length -> " + mRates2_List.size());              // 9

        /**
         * To create a List in to Set
         */
        System.out.println("\nConverting List into Set\n");
        List<String> students = new ArrayList<>();      // length=0

        students.add("Happy");          // ["Happy"]
        students.add("grow");           // ["Happy", "grow"]
        students.add("learn");          // ["Happy", "grow", "learn"]
        students.add("peaceful");       // ["Happy", "grow", "learn", "peaceful"]
        students.add("learn");
        students.add("HAPPY");
        students.add("happy");
        students.add("learn");
        System.out.println("students_List -> " + students);
        System.out.println("students_List size -> " + students.size());

        Set<String> students_Set = new HashSet<>(students);
        System.out.println("students_Set -> " + students_Set);
        System.out.println("students_Set size -> " + students_Set.size());

        /**
         * Replace 1.2 with 1.7
         *
         * Method-1
         * 1. remove 1.2
         * 2. add 1.7
         *
         * Method-2
         * 1. Convert Set into List
         * 2. Apply Set method on List
         * 3. Convert List to Set
         */
        System.out.println("\n\nmRates -> " + mRates);
        List<Double> mRates_List = new ArrayList<>(mRates);
        // find the index of 1.2 (indexOf)
        int indexOf_1_2 = mRates_List.indexOf(1.2);
        // set-method works on index
        if (indexOf_1_2 == -1) {
            System.out.println("1.2 is not present, therefore aborting replacement process");
        } else {
            mRates_List.set(indexOf_1_2, 1.7);
        }
        System.out.println("mRates_List -> " + mRates_List);

        Set<Double> mRates_New = new HashSet<>(mRates_List);
        System.out.println("mRates_New -> " + mRates_New);

        mRates = new HashSet<>(mRates_List);
        System.out.println("mRates -> " + mRates);


    }
}
