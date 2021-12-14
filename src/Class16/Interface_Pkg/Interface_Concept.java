package Class16.Interface_Pkg;

public interface Interface_Concept {

    /**
     * Abstract Method: is a method that cannot have a body
     */

    /**
     * 1. To create interface, we use 'interface' keyword
     * 2. It looks like a class
     * 3. All methods in a Interface are abstract by default.
     * 4. We can create variable of an Interface, but CANNOT create object of an Interface.
     *      Interface_Concept ic;   <-- ALLOWED
     *      new Interface_Concept();    <-- NOT ALLOWED
     * 5. Interface variable will store the object of related class (directly/indirectly)
     * 6. A class can implements an interface using 'implements' keyword.
     *    then, class has to give body to all abstract methods of Interface.
     * 7. A class can implement one or more Interface.
     * 8. We can have normal methods in Interface, it has to be static.
     *    (bcz, we cannot create object of Interface)
     * 9. We can have inheritance in Interfaces as well.
     *    (by using 'extends' keyword)
     *
     * class <--> class (Inheritance using extends keyword)
     *
     * Interface <--> Interface (Inheritance using extends keyword)
     *
     * class <--> Interface (using implements keyword)
     *
     * Note: In case a class implements a child-Interface;
     * Class has to provide body to all abstract methods from child-Interface and parent-Interface.
     *
     *
     */

    public void sayHello();

    public static void sayWelcome() {
        System.out.println("Welcome in Interface static method");
    }



}
