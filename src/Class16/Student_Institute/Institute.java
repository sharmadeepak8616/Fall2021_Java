package Class16.Student_Institute;

public class Institute {

    public static void main(String[] args) {

        Student s1 = new Student("Deepak", 20, "Developer");
        // s1.enroll("Deepak", 20, "Developer");
        s1.showSummary();

        Student s2 = new Student("King", 22, "NY", "QA");
        // s2.enroll("King", 22, "NY", "QA");

        Student s3 = new Student("S3", 22, "PA", "BA");
        // s3.enroll();
        s3.showSummary();

        Student s4 = new Student("Ava", 20, "PM");
        // s4.enroll("Ava", 20, "PM");
        s4.showSummary();

        Student s5 = new Student("Nicki", 19, "BA");


    }

}
