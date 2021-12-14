package Class11.Inheritance;

import Class10.Student_Institute.Student;

public class CClass extends PClass {

    String cName = "Child Class";
    int cNum = 10;

    public void cMethod() {
        // Write code to use pMethod from PClass
        pMethod();
        System.out.println("\nInside CMethod");
        //  Write code to use cVar from CClass
        cVars();    // object not required here bcz the method cVar belong to CClass
    }

    public void cVars() {
        System.out.println("\ncName = " + cName
                + "\ncNum = " + cNum);
    }

}
