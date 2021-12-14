package Class18;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList_2 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();      // length=0

        students.add("Happy");          // ["Happy"]
        students.add("grow");           // ["Happy", "grow"]
        students.add("learn");          // ["Happy", "grow", "learn"]
        students.add("peaceful");       // ["Happy", "grow", "learn", "peaceful"]
        students.add("growing habit");  // ["Happy", "grow", "learn", "peaceful", "growing habit"]
        students.add("good morning");   // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning"]
        students.add("lilli vicknov");  // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov"]
        students.add("kilki");          // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov", "kilki"]
        students.add("Raji now");       // ["Happy", "grow", "learn", "peaceful", "growing habit", "good morning", "lilli vicknov", "kilki", "Raji now"]
        students.add("learn");
        students.add("Learning");
        students.add("LEARN");
        students.add("good morning");
        students.add("HAPPY");
        students.add("happy");
        students.add("learn");
        students.add("hour happy");
        students.add("Jiab haow");
        students.add("good morning");
        students.add("GOOD DAY");       // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, learn, Learning, LEARN, good morning, HAPPY, happy, learn, hour happy, Jiab haow, good morning, GOOD DAY]

        System.out.println("\nStudents -> " + students);                            // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, learn, Learning, LEARN, good morning, HAPPY, happy, learn, hour happy, Jiab haow, good morning, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());      // 20

        /**
         * To find the index of FIRST OCCURRENCE of a value in ArrayList/List
         * method: indexOf()
         *
         * if the given value is found in ArrayList/List
         *      it will return the index of FIRST OCCURRENCE of the given value
         * else
         *      -1
         */
        int indexOf_Good_Day = students.indexOf("Good Day");
        System.out.println("\nIndex of 'Good Day' : " + indexOf_Good_Day);

        int indexOf_Happy = students.indexOf("Happy");
        System.out.println("Index of 'Happy' : " + indexOf_Happy);

        int indexOf_learn = students.indexOf("learn");
        System.out.println("Index of 'learn' : " + indexOf_learn);

        /**
         * To find the index of LAST OCCURRENCE of a value in ArrayList/List
         * Method: lastIndexOf()
         *
         * if the given value is found in ArrayList/List
         *      it will return the index of LAST OCCURRENCE of the given value
         * else
         *      -1
         */
        int lastIndexOf_Good_Day = students.lastIndexOf("Good Day");
        System.out.println("\nLast Index of 'Good Day' : " + lastIndexOf_Good_Day);

        int lastIndexOf_Happy = students.lastIndexOf("Happy");
        System.out.println("Last Index of 'Good Day' : " + lastIndexOf_Happy);

        int lastIndexOf_learn = students.lastIndexOf("learn");
        System.out.println("Last Index of 'learn' : " + lastIndexOf_learn);


        // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, learn,
        // Learning, LEARN, good morning, HAPPY, happy, learn, hour happy, Jiab haow, good morning, GOOD DAY]

        // Find the last occurrence of 'HAPPY' (ignoring the cases)      // 14
        /*
            get the value
            compare value with 'HAPPY' (ignore cases)
                print index

                0
                13
                14
         */
        // Steven
//        int lastIndex = -1;
//        for (int i=0 ; i < students.size()-1 ; i++) {
//            if (students.get(i).equalsIgnoreCase("LeARn")) {
//                lastIndex = i;
//            }
//        }
//        if (lastIndex == -1) {
//            System.out.println("\nLeARn is not present in ArrayList");
//        } else {
//            System.out.println("\nLast index at which LeARn is present : " + lastIndex);
//        }
//
//
//        int lastIndex_1 = -1;
//        for (int i = students.size()-1 ; i >=0 ; i--) {
//            if (students.get(i).equalsIgnoreCase("LeARn")) {
//                lastIndex_1 = i;
//                break;
//            }
//        }
//        if (lastIndex_1 == -1) {
//            System.out.println("\nSecond solution - LeARn is not present in ArrayList");
//        } else {
//            System.out.println("\nSecond solution - Last index at which LeARn is present : " + lastIndex_1);
//        }
//
//        String valueToRemove = "happy";
//        int happyCounter = 0;
//        for (int i=0 ; i <= students.size()-1 ; i++) {
//            if (students.get(i).trim().equalsIgnoreCase(valueToRemove.trim())) {
//                happyCounter++;
//                if (happyCounter != 2) {
//                    students.remove(i);
//                    i--;
//                }
//            }
//        }
//        System.out.println("\nStudents -> " + students);

        System.out.println("\nStudents -> " + students);                            // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, learn, Learning, LEARN, good morning, HAPPY, happy, learn, hour happy, Jiab haow, good morning, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());

        /**
         * To find if a value is present in ArrayList/List
         * method: contains()
         *
         * if the given value os present in ArrayList/List
         *      return true
         * else
         *      return false
         */
        boolean isContains_HAPPY = students.contains("HAPPY");
        System.out.println("\nis contain 'HAPPY' : " + isContains_HAPPY);

        boolean isContains_LearN = students.contains("LearN");
        System.out.println("is contain 'LearN' : " + isContains_LearN);

        /**
         * find number of values contains 'happy' in ArrayList (ignoring cases)
         */
        int counter = 0;
        for (String data : students) {
            if (data.toUpperCase().contains("HAPPY")) {
                counter++;
            }
        }
        System.out.println("\nNumber of values contains 'happy' (ignoring cases) : " + counter);

        /**
         * To find if ArrayList/List is empty
         * method: isEmpty()
         *
         * if the ArrayList is empty
         *      return true
         * else
         *      return false
         */
        boolean isStudentsEmpty = students.isEmpty();
        System.out.println("\nis students empty? : " + isStudentsEmpty);
        System.out.println("Students -> " + students);                            // [Happy, grow, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, learn, Learning, LEARN, good morning, HAPPY, happy, learn, hour happy, Jiab haow, good morning, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());

        /**
         * To empty an ArrayList/List
         * method: clear()
         */
        System.out.println("\nClearing the students-ArrayList");
        students.clear();


        boolean isStudentsEmpty_AfterClear = students.isEmpty();
        System.out.println("\nis students empty? : " + isStudentsEmpty_AfterClear);
        System.out.println("Students -> " + students);                            // []
        System.out.println("Students ArrayList Length -> " + students.size());



    }
}
