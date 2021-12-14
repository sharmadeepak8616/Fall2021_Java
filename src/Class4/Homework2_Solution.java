package Class4;

public class Homework2_Solution {

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

        double fTemp = 55;
        /**
         * Convert deg-Fahrenheit into Deg-Celsius (F -> C)
         *
         * cT = (fT - 32) × 5/9
         * fT = 55
         * cT = 12.7778
         *
         */
        double cTempUsingFTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp + "°F is equal to " + cTempUsingFTemp + "°C");

        /**
         * F -> K
         * T(K) = (T(°F) + 459.67)× 5/9
         */
        double kTempUsingFTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp + "°F is equal to " + kTempUsingFTemp + "°K");

        double cTemp = 55;
        /**
         * C -> F
         * T(F) = (T(°C) × 1.8) + 32
         */
        double fTempUsingCTemp = (cTemp * 1.8) + 32;
        System.out.println(cTemp + "°C is equal to " + fTempUsingCTemp + "°F");
        /**
         * C -> K
         * T(K) = T(°C) + 273.15
         */
        double kTempUsingCTemp = cTemp + 273.15;
        System.out.println(cTemp + "°C is equal to " + kTempUsingCTemp + "°K");

        double kTemp = 55;
        /**
         * K -> C
         * T(C) = T(K) - 273.15
         */
        double cTempUsingKTemp = kTemp - 273.15;
        System.out.println(kTemp + "°K is equal to " + cTempUsingKTemp + "°C");
        /**
         * K -> F
         * T(°F) = T(K) × 9/5 - 459.67
         */
        double fTempUsingKTemp = (kTemp * 9/5) - 459.67;
        System.out.println(kTemp + "°K is equal to " + fTempUsingKTemp + "°F");

    }


}
