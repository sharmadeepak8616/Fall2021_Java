package Class4;

public class JavaOperators_AdvancedAssignment {
    public static void main(String[] args) {

        /**
         * Advanced Assignment (+=, -=, *=, /=, %=)
         *
         */
        int num = 5;
        /**
         * use increment operator to add 5 in num
         */
        num++;      // num = num + 1 -> num=6
        num++;      // num = num + 1 -> num=7
        num++;      // num = num + 1 -> num=8
        num++;      // num = num + 1 -> num=9
        num++;      // num = num + 1 -> num=10

        num+=5;     // num = num + 5 -> num = 15
        System.out.println("num = " + num);

        num-=10;    // num = num - 10 -> num = 5
        System.out.println("num = " + num);

        num*=2;     // num = num * 2 -> num = 10
        System.out.println("num = " + num);

        num/=3;     // num = num / 3 -> num = 3
        System.out.println("num = " + num);

        num%=5;     // num = num % 5 -> num = 3 ( 3%5 = 3)
        System.out.println("num = " + num);

        double accBalance = 100000;

        double deposit = 100;
        accBalance+=deposit;        // accBalance = accBalance + deposit;
        System.out.println("Balance = " + accBalance);

        double withdraw = 500;
        accBalance-=withdraw;       // accBalance = accBalance - withdraw;
        System.out.println("Balance = " + accBalance);





    }
}
