package Class19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Hashmap_Practice {
    public static void main(String[] args) {

        /**
         * List<Integer> ids = [1, 2, 3, 4, 5]
         * List<String> names = ["Deepak", "Imam", "Niki" , "Philip", "Lily"]
         * Map<Integer, String> studentMap = new HashMap<>();
         */

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Deepak");
        studentMap.put(2, "Imam");
        studentMap.put(3, "Niki");
        studentMap.put(4, "Philip");
        studentMap.put(5, "Lily");
        studentMap.put(6, "Farah");
        studentMap.put(7, "Robin");

        System.out.println("\nstudentMap -> " + studentMap);
        System.out.println("studentMap size -> " + studentMap.size());

        /*
            print data as below
            Id = X , Name = ZZZZZ

            Id = 1 , Name = Deepak
            Id = 2 , Name = Imam
            ...
            ...
         */
        System.out.println("Question - 1");
        // get all keys in a variable (keySet)  Set -> [1, 2, 3, 4, 5, 6, 7]
        Set<Integer> allIds = studentMap.keySet();      // [1, 2, 3, 4, 5, 6, 7]
        // using enhanced-for loop
        for (Integer id : allIds) {
            System.out.println("Id = " + id + " , Name = " + studentMap.get(id));
        }


        /*
            if id is even and name-length is greater than 4
            print data as below
            Id = X , Name = ZZZZZ

            Id = 4 , Name = Philip
            Id = 6 , Name = Farah

         */
        System.out.println("\nQuestion - 2");

        for (Integer id : allIds) {
            if (id%2 == 0 && studentMap.get(id).length() > 4) {
                System.out.println("Id = " + id + " , Name = " + studentMap.get(id));
            }
        }












    }
}
