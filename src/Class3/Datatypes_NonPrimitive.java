package Class3;

public class Datatypes_NonPrimitive {

    public static void main(String[] args) {

        /**
         * String: is a non-primitive datatype.
         * can store single or multiple characters
         *
         * value must be enclosed in double-quote while storing in the String-variable.
         *
         * --> String is a Class
         *
         */

        String myName = "Happy Joy";
        // Datatype of myName-variable = String
        // Datatype of "Happy Joy" value = String
        System.out.println("My name is " + myName);

        String singles = "a b d c g g       f g    h i";
        String info = "Singles are --> ";
        System.out.println(info + singles);
        // Singles are --> a b d c g g       f g    h i

        String gender = "M"; // M or F
        System.out.println("Gender --> " + gender);

        String myHomeName = "Hello";            // myHomeName = "Hello"
        myHomeName = myHomeName + "World!";     // myHomeName = "Hello"+"World!"
                                                // myHomeName = "HelloWorld!"

        System.out.println("myHomeName = " + myHomeName);   // myHomeName = "HelloWorld!"

        String myOfcName = "Hello";
        String newOfcName = myOfcName + "World!";
        System.out.println("newOfcName = " + newOfcName);






    }



}
