package Class4;

public class JavaOperators_Logical {
    public static void main(String[] args) {

        /**
         * Logical (&&, ||, !)
         *
         * && -> and operator
         * || -> or operator
         * ! -> not operator
         *
         * are you above 18 and live in NY --> less colg fee
         * age > 18 and state == NY
         * true and true
         * true
         *
         * age > 18 and state == NY --> less colg fee
         * false and true
         * false
         *
         * age > 18 or !(state == NY) --> less colg fee
         * false or !(true)
         * false or false
         * false
         *
         *
         * !(is It Raining right now?)
         * !(false)
         * true
         */

        /**
         * We use logical operators to join two or more conditions.
         * Final result will always be boolean
         *
         * && operator (and operator)
         *  all combined conditions must be true to get final result as true,
         *  if any one of the conditions is false, final result is false.
         *
         * || operator (or operator)
         *  any one of the combined conditions is true to get final result as true,
         *  If all combined conditions are false, then final result is false.
         *
         * ! operator (not operator)
         *  not operator will make true as false and vice versa.
         *
         */

        int lVar1=10, lVar2=20, lVar3=30, lVar4=40;

        boolean lRes1 = lVar1 <= lVar3 && (lVar2 == lVar4+lVar3);
        /*
            lVar1 <= lVar3 && (lVar2 == lVar4+lVar3);
            10 <= 30  && (lVar2 == lVar4+lVar3);
            true && (lVar2 == lVar4+lVar3);
            true && (20 == 70)
            true && false
            false
         */
        System.out.println("lRes1 = " + lRes1);

        boolean lRes2 = lVar1 <= lVar3 && !(lVar2 == lVar4+lVar3);
        /*
            lVar1 <= lVar3 && !(lVar2 == lVar4+lVar3);
            10 <= 30  && !(lVar2 == lVar4+lVar3);
            true && !(20 == 70)
            true && !(false)
            true && true
            true
         */
        System.out.println("lRes2 = " + lRes2);

        boolean lRes3 = lVar3 < lVar1 || (lVar2+lVar3-lVar1 == lVar4 && lVar4+lVar1 <= lVar3%lVar2);
        /*
            lVar3 < lVar1 || (lVar2+lVar3-lVar1 == lVar4 && lVar4+lVar1 <= lVar3%lVar2);
            30 < 10 || (lVar2+lVar3-lVar1 == lVar4 && lVar4+lVar1 <= lVar3%lVar2);
            false || (20+30-10 == 40  && lVar4+lVar1 <= lVar3%lVar2);
            false || (true && lVar4+lVar1 <= lVar3%lVar2);
            false || (true && 40+10 <= 30%20);
            false || (true && 50 <= 10);
            false || (true && false);
            false || false;
            false
         */
        System.out.println("lRes3 = " + lRes3);









    }
}
