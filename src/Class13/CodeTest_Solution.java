package Class13;

public class CodeTest_Solution {

    /**
     * Ques-1:
     * Create a method to return an int-array after sorting an input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     *
     */
    public int[] sortArray(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbersArray[j] < numbersArray[j - 1]) {
                    numbersArray[j] = numbersArray[j] + numbersArray[j - 1];
                    numbersArray[j - 1] = numbersArray[j] - numbersArray[j - 1];
                    numbersArray[j] = numbersArray[j] - numbersArray[j - 1];
                }
            }
        }
        return numbersArray;
    }


    /**
     * Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 123
     * returned value -> 6
     *
     * input -> 323
     * returned array -> 8
     *
     * input -> 90
     * returned array -> 9
     *
     */
    public int addDigitsFromNumber(int number) {
        int total = 0;
        String numberAsString = String.valueOf(number);
        String[] numberStringArray = numberAsString.split("");
        for (String numberString : numberStringArray) {
            total += Integer.valueOf(numberString);
        }
        return total;
    }


    /**
     * Ques-3:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 30
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     *
     * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
     * Method should print ->
     * abcde
     * koli
     *
     */
    public void printCommonInArrays(String[] array1, String[] array2) {
        for (String fromArray1 : array1) {
            for (String fromArray2 : array2) {
                if (fromArray1.equalsIgnoreCase(fromArray2)) {
                    System.out.println(fromArray1.toLowerCase());
                }
            }
        }
    }

    /**
     * Ques-4:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 40
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66}
     * returned array -> {23, 67, 87, 10, 34, 98, 66}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     */
    public int[] removedIntFromArray(int value, int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        int[] restOfValuesArr = new int[arr.length - count];
        int j=0;
        for (int num : arr) {
            if (num != value) {
                restOfValuesArr[j] = num;
                j++;
            }
        }
        return restOfValuesArr;
    }

}
