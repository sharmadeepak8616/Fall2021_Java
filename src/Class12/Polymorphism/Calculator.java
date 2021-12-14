package Class12.Polymorphism;

public class Calculator {

    // As a good practice we create our field-variable as Private



    /**
     * create method which can add 2-int values
     * method should also return the result
     * input parameters : 2
     * return type: int
     */
    public int add(int num1 , int num2) {  // addInts input parameters (2 int , int)
        return num1 + num2;
    }

    /**
     * create method which can add 3-int values
     * method should also return the result
     * input parameters : 3
     * return type: int
     */
    protected int add(int num3 , int num4, int num2) {    // addInts input parameters (3 int, int , int)
        return num3 + num4 + num2;
    }

    /**
     * create method which can add 2-double values
     * method should also return the result
     * input parameters : 2 (double, double)
     * return type: double
     */
    public double add(double num1, double num2) {   // addInts input parameters (2 double , double)
        return num1+num2;
    }

    public double add(int num1, double num2) {   // addInts input parameters (2 int , double)
        sayHello();
        return num1+num2;
    }

    public double add(double num1, int num2) {   // addInts input parameters (2 double , int)
        return num1+num2;
    }

    private void sayHello() {
        System.out.println("Hello from Calculators class");
    }

}
