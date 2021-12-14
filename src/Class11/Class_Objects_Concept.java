package Class11;

public class Class_Objects_Concept {
    public static void main(String[] args) {

        // className objName = new className();
        MyClass abc;

        String sName;


        String name = "Deepak";
        /**
         * is name a variable? - Yes
         * What is the datatype of name? - String
         */

        MyClass mc1 = new MyClass();
        /**
         * is mc1 a variable? - Yes
         * what is the datatype of mc1? - MyClass
         *
         * MyClass mc1 -> mc1 is a variable of datatype-MyClass
         * new MyClass() -> is the object of MyClass
         *
         * MyClass mc1 = new MyClass();
         * Creating an object of MyClass (new MyClass()),
         *  and storing in the MyClass-variable(mc1)
         *
         * using object, we can access non-static variables/method from the class
         * using className, we can access static variables/method from the class
         *
         */
        /**
         * mc1 will get it's own set of all non-static variables with default values
         * mc1 will get the static-variables with latest values,
         *      mc1 will share static variables with other objects
         */
        // mc1 -> num=10 , word="default word" , dNum=1.1 , sWord="default sWord"

        mc1.changeNum(20);
        // mc1 -> num=20 , word="default word" , dNum=1.1 , sWord="default sWord"

        mc1.changeWord("MC1");
        // mc1 -> num=20 , word="MC1" , dNum=1.1 , sWord="default sWord"

        mc1.changeSWord("S-MC1");
        // mc1 -> num=20 , word="MC1" , dNum=1.1 , sWord="S-MC1"

        MyClass mc2 = new MyClass();
        /**
         * mc2 will get it's own set of all non-static variables with default values
         * mc2 will get the static-variables with latest values,
         *      mc2 will share static variables with other objects
         */
        // mc2 -> num=10 , word="default word" , dNum=1.1 , sWord="S-MC1"

        mc1.printAllVariables();    // num=20 , word="MC1" , dNum=1.1 , sWord="S-MC1"

        mc2.changeSWord("SMC2");
        // mc2 -> num=10 , word="default word" , dNum=1.1 , sWord="SMC2"

        mc1.printAllVariables();    // num=20 , word="MC1" , dNum=1.1 , sWord="SMC2"


        mc1.changeSWord("");


        MyClass.changeSWord2("");







    }
}
