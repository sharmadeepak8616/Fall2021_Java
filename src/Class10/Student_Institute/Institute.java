package Class10.Student_Institute;

public class Institute {

    public static void main(String[] args) {

        // Student.enroll("Deepak", 20, "NY", "QA");

        /**
         * Object: an instance of a class
         * (real-life entity which is represented by the class)
         *
         * Syntax to create an object of a class:
         * className objName = new className();
         *
         * when an object will be created, object will get:
         *      all non-static variables with default values
         *      all static variables with latest values
         *
         * STATIC Variables:
         * static variables are being shared between the objects.
         * If the value is changed by any one of the objects, it would be changed for all objects.
         *
         * STATIC Methods:
         * To use static method, we need to use the className (in which the method is present)
         * To use non-static method, we need to use the object-of-the-class (in which the method is present)
         *
         * --> Object provides us the access to non-static methods and variables
         * --> ClassName provides us the access to static methods and variables
         *
         */
        Student s1 = new Student();
        // s1 --> name="" , studentId=0, age==0, state="" courseName=""
        /*
            s1 is the object of Student class
            s1 which have all default properties from the class
            (s1 will have all variables from the class with their default values.)
         */
        s1.enroll("Deepak", 20, "NY", "QA");
        // s1 --> name="Deepak" , studentId=1, age=20, state="NY" courseName="QA"
        s1.showSummary();
        // s1 --> name="Deepak" , studentId=1, age=20, state="NY" courseName="QA"


        Student s2 = new Student();
        // s2 --> name="" , studentId=1, age=0, state="", courseName=""
        s2.enroll("Happy", 19, "CA", "Web-Dev");
        // s2 --> name="Happy" , studentId=2, age=19, state="CA", courseName="Web-Dev"
        s2.showSummary();
        // s2 --> name="Happy" , studentId=2, age=19, state="CA", courseName="Web-Dev"


        Student s3 = new Student();
        // s3 --> name="" , studentId=2, age=0, state="", courseName=""
        s3.enroll("King", 22, "NY", "QA");
        // s3 --> name="King", studentId=3, age=22, state="NY", courseName="QA"


        Student s4 = new Student();
        // s4 --> name="" , studentId=3, age=0, state="", courseName=""
        s4.enroll("Lara", 22, "FL", "PM");
        s4.showSummary();


        s3.showSummary();   // name="Happy", studentId=3, age=22, state="NY", courseName="QA"

        s1.showSummary();

        s2.showSummary();

        s2.changeState("IO");
        s2.showSummary();


        // write code to say hello to all classmates
        Student.sayHelloToAllMates();

        s1.enroll("", 1, "", "");


        Student.wishFromStudents("Happy thanksgiving 2021");

        // siva.wishFromStudents("Happy thanksgiving 2021");
        // Students.wishFromStudents("Happy thanksgiving 2021");

        // s1.wishFromStudent("from Deepak, Happy thanksgiving 2021");



    }

}
