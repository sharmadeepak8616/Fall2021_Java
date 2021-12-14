package Class10;

import java.util.Arrays;

public class Methods_2 {

    public static void main(String[] args) {

        System.out.println("Before the method");

        GreetingMethods.sayGoodMorning();   // which is static method in GreetingMethods-class

        System.out.println("After the method");

        GreetingMethods.helloUser("Deepak");

        GreetingMethods.helloUser("John");

        GreetingMethods.helloUser("Liya");

        GreetingMethods.sayGoodMorning();

        int[] input1 = {23, 54, 12, 67, 90, 34};
        int[] reversedArray = ArrayManipulators.reverseArray(input1);
        System.out.println(Arrays.toString(reversedArray));

        int[] input2 = {-9, 67, -12};
        int[] reversedArray2 = ArrayManipulators.reverseArray(input2);
        System.out.println(Arrays.toString(reversedArray2));

        int[] input3 = {1, 2, 3, 4, 5};
        int[] reversedArray3 = ArrayManipulators.reverseArray(input3);
        System.out.println(Arrays.toString(reversedArray3));

    }




}
