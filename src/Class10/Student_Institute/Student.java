package Class10.Student_Institute;

public class Student {

    // Properties
    String name;
    int age;
    String state;
    String courseName;
    int yourStudentId;
    static int studentId = 0;

    // Actions
    public static void sayHelloToAllMates() {
        System.out.println("Hello to all");
    }

    /*
        method to enroll

        1. what is the purpose of method - to enroll a student
        2. do I need any input from user? - Yes (String, int, String, String)
        3. should I return any value in the end of method? - void
            If yes, then what is the datatype? -
    */
    public void enroll(String sName, int sAge, String sState, String sCourseName) {
        name = sName;
        age = sAge;
        state = sState;
        courseName = sCourseName;
        yourStudentId = ++studentId;
        System.out.println("\n\nHey, thank you " + sName+ " for the enrollment\nYour student-id: " + yourStudentId);
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
        name = newName;
    }

    // dropClass

    /*
        showSummary
        input - No
        return type - No
     */
    public void showSummary() {
        System.out.println("\n**** Student summary: ***\nName : " + name +
                "\nStudent id : " + yourStudentId +
                "\nAge : " + age +
                "\nState : " + state +
                "\nCourse name : " + courseName);
    }

    /*
        Create a method to wish from all students
     */
    public static void wishFromStudents(String ourWishes) {
        System.out.println(ourWishes);
    }

    /*
        Create a method to wish from a particular students
    */
    public void wishFromStudent(String myWish) {
        System.out.println("name " + name) ;
        System.out.println(myWish);
    }




}