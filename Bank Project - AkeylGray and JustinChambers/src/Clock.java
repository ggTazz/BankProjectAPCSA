import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock {
   public static void clocck() {
       //getting current date and time using Date class
       DateFormat df = new SimpleDateFormat("hh:mm aa");
       Date dateobj = new Date();
       System.out.println(df.format(dateobj));

       /*getting current date time using calendar class 
       Calendar calobj = Calendar.getInstance();
       System.out.println(df.format(calobj.getTime()));
       * An Alternative of above*/
    }
}