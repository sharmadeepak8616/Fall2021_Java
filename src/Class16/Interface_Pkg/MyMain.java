package Class16.Interface_Pkg;

public class MyMain {

    public static void main(String[] args) {


        MyClass mc = new MyClass();     // mc (datatype: MyClass) stores the object of MyClass

        Interface_Concept ic;   // (datatype: Interface_Concept)
        // ic stores the object of related class (directly, indirectly)

        /*
            TeslaFactory tf = new TeslaFactory();

            CarGuidelines cg = new TeslaFactory();

            CarGuidelines cg1 = new TeslaTrucks();

            CarGuidelines cg2 = new MyClass();
         */

        Interface_Concept.sayWelcome();

        /*
            AbstractClass_Concept acc = new ChildClass();

            AbstractClass_Concept acc1 = new GrandChild();

            AbstractClass_Concept acc2 = new MyClass();
         */




    }


}
