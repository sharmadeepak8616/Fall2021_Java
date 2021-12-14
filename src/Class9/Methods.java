package Class9;

import java.util.Arrays;

public class Methods {

    /**
     * Method: Lines of code to perform a specific task
     *
     * Benefit: No code repetition
     *
     * Good Practice: Method name should reflect the purpose of the method
     *
     * IMPORTANT :
     *          All methods MUST be inside the class.
     *          Method MUST NOT be created inside a method.
     *
     * Questions to answer before creating the method:
     *  1. what is the purpose of method?
     *  2. do I need any input from user?
     *  3. should I return any value in the end of method?
     *      If yes, then what is the datatype (return type)?
     *
     */
    /*
        method to deposit

        1. what is the purpose of method - to deposit   (name: makeDeposit)
        2. do I need any input from user? - double(amount) , String(accNum)
        3. should I return any value in the end of method? - Yes
            If yes, then what is the datatype? - double(balance) (return type = double)
     */

    /*
        method to say/print "Good Morning"

        1. what is the purpose of method - to say GM   (name: sayGM)
        2. do I need any input from user? - No
        3. should I return any value in the end of method? - No
            If yes, then what is the datatype? - (return type = void)
     */
    /**
     * Syntax to create a method
     *
     * <accessModifier> [static] <returnType> <methodName> (<parameter>) {
     *      //   code to perform
     *      // the task of the method
     *     return-statement // if planning to return any value from method
     * }
     *
     * <accessModifier> : from where you can access the method
     *
     * static : if present, we have to className to access the method, otherwise classObject
     *
     * <returnType>
     *     If you are planning to return a value, returnType should be the datatype of that value
     *     If you are NOT planning to return a value, returnType should be void
     *
     * <parameter>
     *     If you need input(s) from user, create variables of the required datatypes
     *     If you DON'T need input(s) from user, no parameters in the parenthesis
     */

    public static void main(String[] args) {

        System.out.println("Before the method");

        sayGoodMorning();

        System.out.println("After the method");

        helloUser("Deepak");

        helloUser("John");

        helloUser("Liya");

        sayGoodMorning();

        int[] input1 = {23, 54, 12, 67, 90, 34};
        int[] reversedArray = reverseArray(input1);
        System.out.println(Arrays.toString(reversedArray));

    }

    /*
    method to reverse an int-array (eg: [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1])

    1. what is the purpose of method - to reverse an int-array (name: reverseArray)
    2. do I need any input from user? - int[]
    3. should I return any value in the end of method? - Yes
        If yes, then what is the datatype? - (return type = int[])
 */
    public static int[] reverseArray(int[] inputArray) {
        int[] revArray = new int[inputArray.length];
        /*
            inputArray = [1, 2, 3, 4, 5]
            reverseArray[0] = inputArray[inputArray.length-1]       // reverseArray[0] = inputArray[5-1-0]
            reverseArray[1] = inputArray[inputArray.length-2]       // reverseArray[1] = inputArray[5-1-1]
            reverseArray[2] = inputArray[inputArray.length-3]       // reverseArray[2] = inputArray[5-1-2]
            ...                                                     // reverseArray[3] = inputArray[5-1-3]
                                                                    // reverseArray[4] = inputArray[5-1-4]
            ...


            // reverseArray[i] = inputArray[5-1-i]      // i=0,1,2,3...lastIndex    i <= lastIndex  i++
         */
        for (int i=0 ; i <= inputArray.length-1 ; i++) {
            revArray[i] = inputArray[inputArray.length-1-i];
        }
        return revArray;
    }

    /*
        method to say/print "Good Morning"

        1. what is the purpose of method - to say GM   (name: sayGoodMorning)
        2. do I need any input from user? - No
        3. should I return any value in the end of method? - No
            If yes, then what is the datatype? - (return type = void)
    */
    public static void sayGoodMorning() {
        System.out.println("Good Morning");
    }

    /*
        method to say hello to the user (eg: Hello username)

        1. what is the purpose of method - to say hello to user (name: helloUser)
        2. do I need any input from user? - String
        3. should I return any value in the end of method? - Yes
            If yes, then what is the datatype? - (return type = String)     (eg: Hello username)
     */
    public static void helloUser(String username) {
        String msg = "Hello " + username;
        System.out.println(msg);
        // return msg;
    }





}
