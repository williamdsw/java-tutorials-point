package threading;

/**
 * @author William
 */

// THREADING
public class AliveThread extends Thread
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private final int NUMBER_OF_OCCURRENCES = 10;
    
    //------------------------------------------------------------------------//
    // GETTERS
    
    public int getNumberOfOcurrences ()
    {
        return this.NUMBER_OF_OCCURRENCES;
    }
    
    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS
    
    @Override
    public void run ()
    {
        for (int i = 0; i < NUMBER_OF_OCCURRENCES; i++)
        {
            showMessage ();
        }
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    public void showMessage ()
    {
        Thread thread = Thread.currentThread ();
        String name = thread.getName ();
        System.out.printf ("Thread's name: %s \n", name);
    }
}