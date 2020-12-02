package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * @author William
 */

// DATE TIME
public class DisplayDateTime
{
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    private static void showFormatter ()
    {
        // Params
        Formatter formatter = new Formatter ();
        Calendar calendar = Calendar.getInstance ();
        String format = "%tc";
        formatter.format (format, calendar);
        
        // Output
        System.out.printf ("Current date time: %s \n", formatter);
    }
    
    private static void showDate ()
    {
        // Params
        Date date = new Date ();
        
        // Output
        System.out.printf ("Current date time: %s \n", date.toString ());
    }
    
    //------------------------------------------------------------------------//
    // MAIN
    
    public static void main (String[] args)
    {
       showFormatter ();
       showDate ();
    }
}