package Class5;

public class LabSession_Deepak {
    public static void main(String[] args) {

        String gender = "Male";
        int age = 20;
        String password = "ABCD1234";


        /**
         * gender
         * age
         *
         *
         */

        boolean isValid = gender.equalsIgnoreCase("male")
                && age >= 18
                && password.equals("abcd1234");
        System.out.println("isValid = " + isValid);


    }
}
