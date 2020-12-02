package advanced.multithreading;

/**
 * @author William
 */
public class DisplayMessage implements Runnable
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private String message;

    //------------------------------------------------------------------------//
    // CONSTRUCTORS
    
    public DisplayMessage () {}
    public DisplayMessage (String message)
    {
        this.message = message;
    }

    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS
    
    @Override
    public void run ()
    {
        while (true)
        {
            System.out.println (message);
        }
    }
}