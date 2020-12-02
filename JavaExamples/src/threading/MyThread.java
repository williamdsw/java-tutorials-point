package threading;

/**
 * @author William
 */

// THREADING
public class MyThread extends Thread
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private boolean stop = false;
    
    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS
    
    @Override
    public void run ()
    {
        while (true)
        {
            if (stop) break;
        }
    }
}