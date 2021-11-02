package Class3;

public class Homework2 {

    /**
     *
     * Due: Friday, November 5
     *
     *
     * Refer for formula : https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
     *
     * F -> C
     * F -> K
     *
     * C -> F
     * C -> K
     *
     * K -> C
     * K -> F
     *
     */

    public static void main(String[] args) {
        /**
         * Convert deg-Fahrenheit into Deg-Celsius
         *
         * cT = (fT - 32) × 5/9
         * fT = 55
         * cT = 12.7778
         *
         */
        double fTemp = 55;
        double cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + "°F is equal to " + cTemp + "°C");


    }


}
