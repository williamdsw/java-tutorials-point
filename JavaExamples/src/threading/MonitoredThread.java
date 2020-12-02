package threading;

/**
 * @author William
 */

// THREADING
public class MonitoredThread extends Thread
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private boolean isWaiting = true;
    private boolean isReady = false;
    
    //------------------------------------------------------------------------//
    // CONSTRUCTOR
    
    public MonitoredThread () {}
    
    //------------------------------------------------------------------------//
    // SETTERS
    
    public void setIsWaiting (boolean isWaiting)
    {
        this.isWaiting = isWaiting;
    }
    
    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS
    
    @Override
    public void run ()
    {
        Thread currentThread = Thread.currentThread ();
        String name = currentThread.getName ();
        System.out.printf ("%s starting. \n", name);
        
        while (isWaiting)
        {
            System.out.printf ("Waiting %s. \n", name);
        }
        
        System.out.println ("Waiting...");
        startWait ();
        
        try
        {
            Thread.sleep (100);
        }
        catch (InterruptedException exception)
        {
            System.out.println (exception);
            System.out.printf ("%s interrupted. \n", name);
        }
        
        System.out.printf ("%s terminated. \n", name);
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    private synchronized void startWait ()
    {
        try
        {
            while (!isReady)
            {
                wait ();
            }
        }
        catch (InterruptedException exception)
        {
            System.out.println (exception);
            System.out.println ("wait () interrupted.");
        }
    }
    
    public synchronized void startNotify ()
    {
        isReady = true;
        notify ();
    }
}