package Class12.Inheritance_2;

import Class12.Polymorphism.Calculator;

public class MyMain {

    public static void main(String[] args) {

        // Write code to use pMethod from PClass
        PClass pc1 = new PClass();  // parentClass-Variable storing parentClass-Object
                                    // using pc1 can access anything from PClass
        pc1.pMethod();


        CClass cc1 = new CClass();  // childClass-Variable storing childClass-Object
                                    // using cc1 can access anything from CClass
        cc1.pMethod();

        cc1.sayHello();

        cc1.pVars();

        PClass pc2 = new CClass();   // parentClass-Variable storing childClass-Object
                                     // using pc2 can access anything from PClass but overridden methods from CClass
        pc2.sayHello();

        // CClass cc2 = new PClass();   // childClass-Variable storing parentClass-Object
        // cc2.sayHello();


    }
}
