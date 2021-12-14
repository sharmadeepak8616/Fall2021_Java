package Class12;

public class OOPS_Concept_3 {

    /**
     * OOPS Concept
     *
     * 1. Encapsulation
     *      Wrapping up the code in a single unit (eg: Class)
     *      To implement Encapsulation concept, we create Class and write code in it.
     *
     * 2. Abstraction:
     *      Hiding unnecessary information from user
     *      To implement Abstraction, by creating methods.
     *
     * 3. Inheritance
     *      -> To implement Inheritance, we create parent-child relationship between two classes.
     *      -> childClass can access parentClass methods/variables (except private methods/variables)
     *      -> we use "extends" keyword with childClass to achieve Inheritance
     *      -> a class can extend ONLY one class (why? - Diamond Problem)
     *
     * 4. Polymorphism
     *      -> same name but different forms
     *      -> In Java: when we have two or more methods with SAME name but different input-parameters and code
     *      -> Types:
     *      1. Compile Time Polymorphism (Static Binding or Method Overloading)
     *      2. Run Time Polymorphism (Dynamic Binding or Method Overriding)
     *
     *      Compile Time Polymorphism (Static Binding or Method Overloading)
     *          In a class, we can have two or more method with SAME name but different input-parameters
     *          Ways to set different input-parameters:
     *              1. different number of input-parameters
     *              2. different datatype of input-parameters
     *              3. different sequence of input-parameters
     *          Note: Return-type DOES NOT play any role in Compile Time Polymorphism
     *
     *      Run Time Polymorphism (Dynamic Binding or Method Overriding)
     *          This can be achieved ONLY in Inheritance set-up
     *          when we have method with SAME name and SAME input-parameters in
     *              parentClass and childClass
     *          when we want to overwrite/override a parentClass-method with childClass-method.
     *
     * ***********************
     *
     * super - keyword
     *
     * We use 'super' keyword, when we want to call/execute parentClass method inside child-Class method.
     *
     */

}
