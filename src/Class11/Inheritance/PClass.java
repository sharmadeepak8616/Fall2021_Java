package Class11.Inheritance;

public class PClass {

    String pName = "Parent Class";
    int pNum = 10;

    public void pMethod() {
        System.out.println("\nInside PMethod");
        //  Write code to use cVar from CClass
        CClass cc1 = new CClass();
        cc1.cVars();
    }

    public void pVars() {
        System.out.println("\npName = " + pName
        + "\npNum = " + pNum);
    }


}
