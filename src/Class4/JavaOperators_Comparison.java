package Class4;

public class JavaOperators_Comparison {
    public static void main(String[] args) {

        /**
         * Comparison (>, <, >=, <=, ==, !=)
         *
         * Result of every comparison operation is always boolean
         *
         */

        int com1 = 5;
        int com2 = 7;

        // int com3=5, com4=7;

        boolean com1GrCom2 = com1 > com2;       // > : greater than
        System.out.println(com1 + " > " + com2 + " = " + com1GrCom2);   // 5 > 7 = false

        boolean com1LeCom2 = com1 < com2;    // < : less than
        System.out.println(com1 + " < " + com2 + " = " + com1LeCom2);   // 5 < 7 = true

        boolean com1GrEqCom2 = com1 >= com2;   // >= : greater than or equal to
        System.out.println(com1 + " >= " + com2 + " = " + com1GrEqCom2);   // 5 >= 7 = false

        boolean com1LeEqCom2 = com1 <= com2;   // >= : less than or equal to
        System.out.println(com1 + " <= " + com2 + " = " + com1LeEqCom2);   // 5 <= 7 = true

        boolean com1EqCom2 = com1 == com2; // == : is equal to
        System.out.println(com1 + " == " + com2 + " = " + com1EqCom2);   // 5 == 7 = false

        boolean com1EqNtCom2 = com1 != com2; // != : is not equal to
        System.out.println(com1 + " != " + com2 + " = " + com1EqNtCom2);   // 5 != 7 = true

        boolean res = com1++ == --com2;
            /*
                post-Increment, isEqualTo , pre-decrement , assignment
                pre-decrement , isEqualTo , assignment, post-Increment
                com2=6   ,   com1(5)==com2(6) , false ,     com1=6
             */
        System.out.println("res = " + res);     // false
        System.out.println(com1);               // 6
        System.out.println(com2);               // 6

    }
}
