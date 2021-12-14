package Class17;

import java.util.ArrayList;
import java.util.List;

public class PracticeQuestions {
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


        String valueToRemove = "Grow";
        /**
         * Remove the value from students-ArrayList (ignore cases)
         * Hint:
         *      remove-method using index
         *      normal-for-loop
         *      if
         *      get-method
         *      equalsIgnoreCases
         *
         */
        /*
            if (students.get(0) is equalsIgnorecase to valueToRemove)
                sout(grow is present at index-0)
            if (students.get(1) is equalsIgnorecase to valueToRemove)
                sout(grow is present at index-1)
            if (index-2-value is equalsIgnorecase to valueToRemove)
                sout(grow is present at index-0)
                ...
                ...
            if (students.get(last-Index) is equalsIgnorecase to valueToRemove)
                sout(grow is present at index-last-Index)


            if (students.get(i) is equalsIgnorecase to valueToRemove)   i=0,1,2...lastIndex
                sout(grow is present at i)

         */
        for (int i=0 ; i <= students.size()-1 ; i++) {
            if (students.get(i).equalsIgnoreCase(valueToRemove)) {
                students.remove(i);
            }
        }

        System.out.println("\nStudents -> " + students);                            // [Happy, learn, peaceful, growing habit, good morning, lilli vicknov, kilki, Raji now, jpw, Learning, LEARN, HAPPY, hour happy, Jiab haow, good night, GOOD DAY]
        System.out.println("Students ArrayList Length -> " + students.size());      // 16







    }
}
