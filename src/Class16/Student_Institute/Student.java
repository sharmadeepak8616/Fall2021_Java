package Class16.Student_Institute;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

    // Properties
    private String name;
    private int age;
    private String state;
    private String courseName;
    private int yourStudentId;
    private static int studentId = 0;
    private String[] courseNames = {"QA", "PM", "BA", "Developer"};
    private Scanner input = new Scanner(System.in);

    /*
        method to enroll

        Requirement:
            no student below 16 should be able to enroll
            no student should be able to enroll if courseName is other than "QA, PM, BA, Developer"

            "PM" -- "QA, PM, BA, Developer"

    */
    public Student(String name, int sAge, String sState, String sCourseName) {
        if (sAge < 16) {
            System.out.println("Sorry, you are under age.");
        } else {
            // "PM" -- {"QA", "PM", "BA", "Developer"}
            boolean isCourseValid = false;
            for (String cName : courseNames) {  // cName=PM , sCourseName=PM
                if (cName.equalsIgnoreCase(sCourseName)) {
                    isCourseValid = true;
                    this.name = name;    // name = sName
                    age = sAge;
                    state = sState;
                    courseName = sCourseName;
                    yourStudentId = ++studentId;
                    break;      // keyword to stop loop
                }
            }
            if (isCourseValid) {
                System.out.println("\n\nHey, thank you " + this.name + " for the enrollment\nYour student-id: " + yourStudentId);
            } else {
                System.out.println("\n\nIncorrect course name provided.\nProvided course name: " + sCourseName +"\nValid course names: " + Arrays.toString(courseNames));
            }
        }
    }

    public Student(String sName, int sAge, String sCourseName) {
        if (sAge < 16) {
            System.out.println("Sorry, you are under age.");
        } else {
            // "PM" -- {"QA", "PM", "BA", "Developer"}
            boolean isCourseValid = false;
            for (String cName : courseNames) {  // cName=PM , sCourseName=PM
                if (cName.equalsIgnoreCase(sCourseName)) {
                    isCourseValid = true;
                    name = sName;
                    age = sAge;
                    courseName = sCourseName;
                    yourStudentId = ++studentId;
                    break;      // keyword to stop loop
                }
            }
            if (isCourseValid) {
                System.out.println("\n\nHey, thank you " + sName + " for the enrollment\nYour student-id: " + yourStudentId);
            } else {
                System.out.println("\n\nIncorrect course name provided.\nProvided course name: " + sCourseName +"\nValid course names: " + Arrays.toString(courseNames));
            }
        }
    }

    /*
        changeState
        input - String (newState)
        return type - No
     */
    public void changeState(String newState) {
        state = newState;
    }

    /*
        changeName
        input - newName(String)
        return type - No
     */
    public void changeName(String newName) {
        if (name.equalsIgnoreCase(newName)) {
            System.out.println("Please enter new name");
        } else {
            name = newName;
            System.out.println("Name changed successfully");
        }
    }

    /*
        showSummary
        input - No
        return type - No

        show should be able to see details if correct id provided

     */
    public void showSummary() {
        System.out.println("\n**** Student summary: ***\nName : " + name +
                "\nStudent id : " + yourStudentId +
                "\nCourse name : " + courseName);
    }

    /*
    showDetailSummary
    input - int
    return type - No

    show should be able to see details if correct id provided

 */
    public void showDetailSummary() {

        showSummary();

        System.out.println("\nTo see detail summary, please enter the id: ");
        int id = input.nextInt();
        if (id == yourStudentId) {
            System.out.println("\n**** Detail Student summary: ***\nName : " + name +
                    "\nStudent id : " + yourStudentId +
                    "\nAge : " + age +
                    "\nState : " + state +
                    "\nCourse name : " + courseName);
        } else {
            System.out.println("Incorrect id value : " + id);
        }
    }




}