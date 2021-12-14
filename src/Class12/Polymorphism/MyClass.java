package Class12.Polymorphism;

public class MyClass {
    public static void main(String[] args) {

        // Object of Calculator
        // className objName = new className();
        Calculator cal = new Calculator();


        // use add2Ints from Calculator class
        int result = cal.add(2,3);
        System.out.println("2 + 3 = " + result);


        int result1 = cal.add(2,3,4);
        System.out.println("2 + 3 + 4 = " + result1);







    }
}
