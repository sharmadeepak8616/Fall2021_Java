package Class12.Inheritance_2;

import Class12.Inheritance_2.PClass;

public class CClass extends PClass {

    String cName = "Child Class";
    int cNum = 10;

    public void cMethod() {
        // Write code to use pMethod from PClass
        pMethod();
        System.out.println("\nInside CMethod");
        //  Write code to use cVar from CClass
        cVars();    // object not required here bcz the method cVar belong to CClass
        super.sayHello(); // write code to use/execute/run sayHello() method from P-Class
        pVars();
        methodPClass();
    }

    public void cVars() {
        System.out.println("\ncName = " + cName
                + "\ncNum = " + cNum);
    }

    public void sayHello() {
        // cVars(); // write code to use/execute/run cVars() method from C-Class
        // pVars(); // write code to use/execute/run pVars() method from P-Class
        // super.sayHello(); // write code to use/execute/run sayHello() method from P-Class
        System.out.println("Hello from C-Class");
    }

}
