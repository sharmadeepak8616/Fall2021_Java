package Class16.Constructor_Pkg;

public class Constructor_Concept {


    public static void sayHello() {
        System.out.println("SayHello method");
    }

    public static void sayBye() {
        System.out.println("SayBye method");
    }

    // This method needs to be executed to create object
    public Constructor_Concept(String username) {
        System.out.println("Hello " + username+ ", Object for Constructor_Concept created");
    }

    public Constructor_Concept(String username, int age) {
        System.out.println("Hello " + username+ ", age = " + age + ". Object for Constructor_Concept created");
    }

    /**
     * Constructor: It's a special method.
     *  1. It has the SAME NAME as of the class.
     *  2. It does NOT have any return type, not even void.
     *  3. Technical use of constructor: In order to create an object of a class, Java runs the constructor method of the class.
     *  To execute normal method -> we use object or className.
     *  To execute Constructor method -> when we create object, constructor method gets executed automatically.
     *                                  we cannot use object/className to run the constructor.
     *
     * Syntax:
     * <accessModifier> <constructorMethodName> (argumentsIfRequired) {
     *     // code we want to execute
     *     // in order to create an object
     * }
     *
     * 1. Constructor can be public, protected or private
     *      public -> allows us to create object of the class anywhere in the project.
     *      protected -> allows us to create object of the class only within the package.
     *      private -> object of the class CANNOT be created
     *      (when all methods/variables in a class as static, we can have private Constructor)
     *      eg: Math.java
     * 2. Constructor can have any number of arguments.
     * 3. We can have one or more Constructors in a class.
     *      This is due to Method Overloading or Compile Time Polymorphism. (Constructor Overloading)
     * 4. If user defined constructor is present in the class, Java will NEVER create a default constructor.
     *
     */

}
