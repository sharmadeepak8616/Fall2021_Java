package Class20;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_Concept {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        /**
         * To create Date-object using Calendar-instance/object
         * Method: getTime()
         * return type: Date
         */
        Date fromCal = cal.getTime();
        System.out.println("\n\nDate using Calendar-instance -> " + fromCal);


        Date newDate = null;
        String dateText = "01/01/22 9:15:22 am";   // MM/dd/yy
        SimpleDateFormat makeDate = new SimpleDateFormat("MM/dd/yy h:mm:ss a");
        try {
            newDate = makeDate.parse(dateText);

            System.out.println("Date after conversion -> " + newDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\nCustomized Date -> " + newDate);

        /**
         * To create Calendar instance using Date-object
         * method: setTime()
         */
        cal.setTime(newDate);
        System.out.println(cal);

        // add 65 days, 10 years in Cal
        // subtract 2 months in Cal
        // print the Date of the day
        cal.add(Calendar.DATE, 65);
        cal.add(Calendar.YEAR, 10);
        cal.add(Calendar.MONTH, -2);

        // get date from the Calendar instance
        Date changedDate = cal.getTime();

        System.out.println("\n\nChanged date -> " + changedDate);

        /**
         * Print the checkin and checkout date in format like: Jan, 01 2022
         *
         * Checkin date: current Date
         *
         * Checkout date: 7 days from the checkin
         */
        Date currentDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MMM, dd yyyy");

        String checkinDate = df.format(currentDate);
        System.out.println("\n\nCheckin Date : " + checkinDate);

        Calendar myCal = Calendar.getInstance();
        myCal.setTime(currentDate);

        myCal.add(Calendar.DAY_OF_MONTH, 7);

        Date checkoutDateObject = myCal.getTime();
        String checkoutDate = df.format(checkoutDateObject);
        System.out.println("Checkout Date : " + checkoutDate);

    }
}
