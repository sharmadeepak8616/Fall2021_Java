package Class10;

public class ArrayManipulators {

    public static int[] reverseArray(int[] inputArray) {
        int[] revArray = new int[inputArray.length];
        for (int i=0 ; i <= inputArray.length-1 ; i++) {
            revArray[i] = inputArray[inputArray.length-1-i];
        }
        return revArray;
    }



}
