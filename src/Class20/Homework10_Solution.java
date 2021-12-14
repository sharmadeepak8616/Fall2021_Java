package Class20;

import Class16.Interface_Pkg.Interface_Concept;

import java.util.*;

public class Homework10_Solution {
    public static void main(String[] args) {
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green","red","red","red","red","red","red"};

        // System.out.println("Solution for Q2 -> " + findDuplicateWordWithCount(arr));


        // System.out.println("\nSolution for Q3 -> " + getColorMaxTimes(arr));

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Deepak");
        studentMap.put(2, "Imam");
        studentMap.put(3, "deepak");
        studentMap.put(4, "Philip");
        studentMap.put(5, "philip");
        studentMap.put(6, "Farah");
        studentMap.put(7, "Robin");

        findKeysWithSameValue(studentMap);

    }

    // Due Date: Dec 12

    /**
     * Question-1:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     *
     * Create method that will print the keys with same value
     *
     * Input to method -> [ {101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"} ]
     * Output (print) ->
     *      "happy" is present with 101, 103, 106 keys
     *      "peace" is present with 102, 105 keys
     *
     * Input to method -> [ {111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"} ]
     * Output (print) ->
     *
     */
    /*
        1. get all keys in a variable (keySet)  [101, 102, 103, 104, 105, 106]
        2. create a Set<Integer> to store duplicate keys (keysWithSameValue)
        3. Loop using keys
            Integer key = 101
            v101
                v102
                if (v102 is equalsIgnoreCase to v101)
                    add 101, 102 in keysWithSameValue-Set
                v103
                if (v103 is equalsIgnoreCase to v101)
                    add 101, 103 in keysWithSameValue-Set
                ...
                ...

            if (keysWithSameValue.size > 0)
                sout(v101 is present with keysWithSameValue keys)
            v102
                if (v103 is equalsIgnoreCase to v102)
                    add 102, 103 in keysWithSameValue-Set
                if (v104 is equalsIgnoreCase to v102)
                    add 102, 104 in keysWithSameValue-Set
                ...
                ...
     */
    public static void findKeysWithSameValue(Map<Integer, String> inputMap) {
        Set<Integer> allKeys = inputMap.keySet();   // #1
        Set<Integer> keysWithSameValue = new HashSet<>();   // #2
        Map<String, Set<Integer>> result = new HashMap<>();

        for (Integer key : allKeys) {                   // #3
            keysWithSameValue.clear();
            for (Integer innerKey : allKeys) {
                if(key != innerKey && inputMap.get(key).equalsIgnoreCase(inputMap.get(innerKey))) {
                    keysWithSameValue.add(key);
                    keysWithSameValue.add(innerKey);
                }
            }
            if (keysWithSameValue.size() > 0) {
                System.out.println(keysWithSameValue);
                Set<Integer> keysWithSameValue1 = keysWithSameValue;
                result.put(inputMap.get(key).toUpperCase(), keysWithSameValue1);
                System.out.println(result);
            }
        }
        System.out.println(result);
    }

    // Steven's solution for Question-1
    public void returnDuplicatedValuesWithKeys(Map<Integer, String> inputMap) {
        Set<String> inputSet = new HashSet<>();
        for (Integer key : inputMap.keySet()) {
            inputSet.add(inputMap.get(key).toLowerCase(Locale.ROOT));
        }

        for (String str : inputSet) {
            int counter = 0;
            String resultString = "";
            for (Integer key : inputMap.keySet()) {
                if (str.equalsIgnoreCase(inputMap.get(key))) {
                    counter++;
                    resultString = resultString + key + ", ";
                }
            }
            if (counter > 1) {
                System.out.println(str + " is present with: " + resultString.substring(0, resultString.length() - 2));
            }
        }

    }

    /**
     * Question-2:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     *
     *      Map<String, Integer>
     */
    public static Map<String, Integer> findDuplicateWordWithCount(String[] words) {
        Map<String, Integer> duplicateCount = new HashMap<>();

        for (int i=0 ; i < words.length ; i++) {
            if (!duplicateCount.containsKey(words[i])) {
                int count = 1;
                for (int j=i+1 ; j < words.length ; j++) {
                    if (words[j].equalsIgnoreCase(words[i])) {
                        count++;
                    }
                }
                if (count > 1) {
                    duplicateCount.put(words[i], count);
                }
            }
        }
        return duplicateCount;
    }


    /**
     * Question-3:
     *
     * Create a method that will take String-array as input
     *
     * Method should return the name(s) of color present max number of times in given String array
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all
     *
     * Hint: return type as Set<String> or List<String>
     *
     */
    public static Set<String> getColorMaxTimes(String[] colors) {

        // storing count of all colors (using above Q2 method to do this step)
        Map<String, Integer> colorCount = findDuplicateWordWithCount(colors);

        // finding the maximum number in the color count
        Collection<Integer> allColorCount = colorCount.values();
        Integer maxValue = 0;

        for (Integer value : allColorCount) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // storing colorName with maxCount in a Set(maxColor)
        Set<String> allColorNames = colorCount.keySet();
        Set<String> maxColor = new HashSet<>();

        for (String colorName : allColorNames) {
            if (colorCount.get(colorName) == maxValue) {
                maxColor.add(colorName);
            }
        }

        return maxColor;
    }

}
