package Class11;

public class MyClass {

    int num = 10;
    String word = "default word";
    double dNum = 1.1;
    static String sWord = "default sWord";


    public void printAllVariables() {
        System.out.println("\nAll variables: \nnum = " + num
        + "word = " + word
        + "dNum = " + dNum
        + "sWord = " + sWord);
    }


    public void changeWord(String newValue) {
        word = newValue;
    }

    public void changeNum(int newValue) {
        num = newValue;
    }

    public void changeDNum(double newValue) {
        dNum = newValue;
    }

    public void changeSWord(String newValue) {
        sWord = newValue;
    }

    public static void changeSWord2(String newValue) {
        sWord = newValue;
    }

}
