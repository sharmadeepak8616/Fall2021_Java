package Class16.AbstractClassPkg;

public abstract class AbstractClass_Concept {

    /**
     * Abstract Method: is a method that cannot have a body
     */

    /**
     * 1. To create Abstract class, we use 'abstract' keyword
     * 2. Like any normal class, it can have field variables and normal methods.
     *      and, it can have abstract-methods as well.
     * 3. By default, all methods are considered as normal methods
     *      If we want to create an abstract method, we have to use 'abstract' keyword
     *      after the access-modifier while create the method.
     * 4. We can create variable of Abstract class, but
     *      we CANNOT create object of Abstract class.
     *      --> AbstractClass variable will store the object of related class (directly/indirectly)
     *
     * 5. Child of Abstract class has to give body to all abstract-methods of ParentClass (or Abstract Class)
     *
     *
     * Abstract-Class vs Interface:
     * 1. Interface is not a class, whereas Abstract-Class is a class.
     * 2. In Interface, all methods are abstract by default.
     *      whereas, in Abstract-Class, we have to use 'abstract' keyword to create abstract method.
     * 3. In interface, to create a method with body; we have to use 'static' keyword
     *      whereas, In Abstract-Class, we can create a method with body with/without using 'static' keyword
     * 4. Class implements the Interface, whereas Class extends Abstract-class.
     *
     */

    public void sayHelloDear() {
        System.out.println("Hello Dear");
    }

    public abstract void sayBye();



}
