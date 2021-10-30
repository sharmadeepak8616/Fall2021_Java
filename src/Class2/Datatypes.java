package Class2;

public class Datatypes {

    public static void main(String[] args) {

        /**                             Basic types of Variables
         * numbers
         *      whole                   ->  byte, short, int, long
         *      decimal                 ->  float, double
         *
         * text
         *      single-character        ->  char
         *      multiple-character      ->  String
         *
         * yes/no
         *      true/false              ->  boolean
         *
         */

        /**
         * How many datatypes we have in Java?
         * We have 2 types of datatypes in Java.
         * 1. Primitive
         *      Datatypes which comes with Core java
         *      --> byte, short, int, long, float, double, char, boolean
         *
         * 2. Non-Primitive  (All Java-Classes and Interfaces are Non-Primitive datatypes)
         *      Datatypes which got added in java by Java users
         *      --> String, Array etc
         *
         */

        /**
         * To store data, we need variable
         * IMP: Type of data must be same as datatype of variable.
         *
         * Syntax to create a variable
         *      datatype vName;         // creating a variable (name = vName) of datatype (datataype)
         *                              // there is nothing stored in vName
         *      vName = val;            // storing value (val) inside vName-variable
         *
         *      -- OR --
         *
         *      datatype vName = val;
         *
         */
        // Write code to create float-variable of any name?
        float height;   // number is variable of float type

        // Write code to store number of cars in your house (4)
        byte numberOfMyCars = 4;

        /**
         * Good practices to provide names:
         * 1. variables:
         *      -> names cannot have spaces
         *      -> variable name should relate to the stored value
         *      -> starts with lowercase
         *      -> never starts with digit or special character
         *      -> if name having more than 1 word, follow camelCaseFormat
         *      eg:
         *      number of my cars -> numberofmycars -> numberOfMyCars
         *
         * 2. Class:
         *      -> names cannot have spaces
         *      -> Class name should relate to the code inside Java class
         *      -> starts with Uppercase
         *      -> never starts with digit or special character
         *      -> if name having more than 1 word, follow CamelCaseFormat
         *
         * 3. Package:
         *      -> names cannot have spaces
         *      -> Package name should relate to the Java files inside the package
         *      -> starts with Uppercase
         *      -> never starts with digit or special character
         *      -> if name having more than 1 word, follow CamelCaseFormat
         *
         */


    }


}
