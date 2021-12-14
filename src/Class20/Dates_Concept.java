package Class20;

import com.sun.corba.se.spi.orbutil.fsm.FSMImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates_Concept {
    public static void main(String[] args) {


        Date now = new Date();

        System.out.println(now);    // what is datatype of now? -> Date
        // Mon Dec 13 19:11:48 EST 2021

        // SimpleDateFormat - helps to fetch a value from Date object in a particular pattern

        // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat df = new SimpleDateFormat("H-a");    // 19pm pm19 19-pm    19 pm

        /**
         * format method: helps to fetch data from Date-object as String in a particular pattern
         */
        String amPm = df.format(now);
        System.out.println(amPm);

        // print date from the Date-object in format -> fullMonthName date Year (eg: December 13 2021)
        SimpleDateFormat df2 = new SimpleDateFormat("MMMM dd yyyy");

        /**
         * M : month in number (7)
         * MM : month in number (07)
         * MMM : month in abbreviation (Jul)
         * MMMM : month name in full (July)
         *
         * yy : last 2 digits of year (21)
         * yyyy : year in full (2021)
         *
         * if current date is in single digit
         * d : 7
         * dd : 07
         *
         * if current date is in double digits
         * d : 11
         * dd : 11
         *
         * if hour is in single digit
         * h : 2
         * hh : 02
         *
         * if hour is in double digit
         * h : 19
         * hh : 19
         *
         */
        System.out.println(df2.format(now));

        /**
         * if the current date is less then 15
         *      print we are in first half of the month
         * else
         *      print we are in second half of the month
         */
        /*
            Pseudo Code
            1. create Date object
            2. create simpleDateFormat with pattern (d)
            3. apply simpleDateFormat on Date-object ("13")
            "13" -> 13
            if (13 < 15)
                print we are in first half of the month
            else
                print we are in second half of the month
         */
        Date currDate = new Date();
        SimpleDateFormat dateOnly = new SimpleDateFormat("d");
        String dateString = dateOnly.format(currDate);  // "13"
        int dateInteger = Integer.valueOf(dateString);
        if (dateInteger < 15) {
            System.out.println("\nwe are in first half of the month");
        } else {
            System.out.println("\nwe are in second half of the month");
        }


        /**
         * Create a Date object using String value
         */
        Date newDate = null;
        String dateText = "01/01/22 9:15:22 am";   // MM/dd/yy

        SimpleDateFormat makeDate = new SimpleDateFormat("MM/dd/yy h:mm:ss a");

        try {
            newDate = makeDate.parse(dateText);

            System.out.println("Date after conversion -> " + newDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*
            now = Mon Dec 13 20:00:47 EST 2021
            newDate = Sat Jan 01 09:15:22 EST 2022
         */

        /**
         * To verify if two dates are equal
         * method: equals
         * return type: boolean
         */
        boolean isNowEqualsNewDate = now.equals(newDate);
        System.out.println("\nis now equals to newDate -> " + isNowEqualsNewDate);

        /**
         * To verify if one date come before another date
         * Method: before
         * return type: boolean
         */
        boolean isNowBeforeNewDate = now.before(newDate);    // if now comes before newDate
        System.out.println("is now comes before newDate -> " + isNowBeforeNewDate);

        /**
         * To verify if one date come after another date
         * Method: after
         * return type: boolean
         */
        boolean isNowAfterNewDate = now.after(newDate);    // if now comes after newDate
        System.out.println("is now comes after newDate -> " + isNowAfterNewDate);

    }
}
