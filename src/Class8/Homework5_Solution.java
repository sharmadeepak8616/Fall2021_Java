package Class8;

import sun.java2d.opengl.OGLRenderQueue;

public class Homework5_Solution {
    public static void main(String[] args) {

        // Due date: Nov 10

        /**
         * Create an int variable and store any value in it.
         * if the number is divisible by 5, print "divisible by 5"
         * if the number is divisible by 3, print "divisible by 3"
         * if the number is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the number is NOT divisible by 5, 3, or 15, print the value in int-variable
         *
         * int num = 45
         */
        int num = 45;
        if (num%5 == 0 && num%3 == 0) {
            System.out.println(num + " is divisible by 5 and 3");
        } else if (num%5 == 0) {
            System.out.println(num + " is only divisible by 5");
        } else if (num%3 == 0) {
            System.out.println(num + " is only divisible by 3");
        } else {
            System.out.println(num + " is neither divisible by 5 nor by 3");
        }


        /**
         * Create two variable, one to store student-score and another to store the max-score.
         * If student-score is NOT valid, print error statement, "Invalid student score entered"
         *
         * based on the student scoring percentage, print the grade.
         *
         * Grade-A: 91-100%
         * Grade-B: 81-90.99%
         * Grade-C: 71-80.99%
         * Grade-D: 61-70.00%
         * Grade-E: less than 61
         *
         * (double) myScore = 180
         * (int) maxScore = 200
         *
         * (180/200)*100
         *
         */
        int maxScore = 180;
        double score = 170;

        double percentage = (score/maxScore) * 100;
        char grade;

        System.out.println("\nScore: " + score);
        System.out.println("Max score: " + maxScore);
        if (score > maxScore) {
            System.out.println("Invalid score entered.");
        } else {
            if (percentage >= 91) {
                grade = 'A';
            } else if (percentage >= 81) {
                grade = 'B';
            } else if (percentage >= 71) {
                grade = 'C';
            } else if (percentage >= 61) {
                grade = 'D';
            } else {
                grade = 'E';
            }
            System.out.println("Percentage: " + percentage);
            System.out.println("Grade: " + grade);
        }

    }
}
