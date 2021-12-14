package Class11.Student_Institute;

public class Institute {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.enroll("Deepak", 20, "NY", "QA");
        // s1.showSummary();

        Student s2 = new Student();
        s2.enroll("Happy", 19, "CA", "Web-Dev");
        // s2.showSummary();


        Student s3 = new Student();
        s3.enroll("King", 22, "NY", "QA");

        Student s4 = new Student();
        s4.enroll("Joyce", 20, "QA");

        s1.changeName("New Name");


//
//
//        Student s4 = new Student();
//        s4.enroll("Lara", 22, "FL", "PM");
//        s4.showSummary();
//
//
//        s3.showSummary();
//
//        s1.showSummary();
//
//        s2.showSummary();
//
//        s2.changeState("IO");
//        s2.showSummary();
//
//
//        // write code to say hello to all classmates
//        Student.sayHelloToAllMates();
//
//        s1.enroll("", 1, "", "");
//
//
//        Student.wishFromStudents("Happy thanksgiving 2021");

        // siva.wishFromStudents("Happy thanksgiving 2021");
        // Students.wishFromStudents("Happy thanksgiving 2021");

        // s1.wishFromStudent("from Deepak, Happy thanksgiving 2021");


        s1.showDetailSummary();



        // write code to call showSummary for s1-object
        s1.showSummary();

        // write code to call wishFromStudents for s1-object
        Student.wishFromStudents("Our wishes to you");



    }

}
