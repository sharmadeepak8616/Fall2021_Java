package Class14;

import java.util.Scanner;

public class BoostUpSession {
    public static void main(String[] args) {

// Initialization -> Where to start
// Condition -> How long to continue
// Increment/Decrement

/**
 *1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 *
 */

        for(int i = 1; i <=4; i++ ) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



/**
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 */

        for(int i = 1; i <=6; i++ ) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


/**
 * # # # #
 * #     #
 * #     #
 * # # # #
 *
 */

        for(int i = 1; i <=4; i++ ) {
            if(i==2 || i==3) {
                System.out.print("#" + "     " + "#");
            } else
                for (int j = 1; j <= 4; j++) {
                    System.out.print("#" + " ");
                }
            System.out.println();
        }



        /**
         * Create a system that checks valid username and password
         * And if both username and password are valid then only system displays homepage
         * User can only try upto 5 times with invalid login details
         * After each try system should say, "You have ... more try left"
         * if it reaches 5 times then system should be locked for 10 min
         */

        String userName = "";
        String passWord = "";
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Pls enter user name...");
            userName = scan.nextLine();
            System.out.println("Pls enter password...");
            passWord = scan.nextLine();

            if (userName.equalsIgnoreCase("steven") && passWord.equals("pass1234")) {
                System.out.println("Welcome to homepage.");
                break;
            } else {
                System.out.println("Your credentials are not correct! pls try again !");
                System.out.println("You have " + (5-i) + " attempts left.");
            }
            if(i==5)
                System.out.println("You are locked for 10 min!");
        }

    }

}
