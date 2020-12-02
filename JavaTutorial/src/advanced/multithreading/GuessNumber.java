package advanced.multithreading;

/**
 * @author William
 */
public class GuessNumber extends Thread
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private int number;
    private String threadName;

    //------------------------------------------------------------------------//
    // CONSTRUCTORS
    
    public GuessNumber () {}
    public GuessNumber (int number)
    {
        this.number = number;
        this.threadName = this.getName ();
    }

    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS
    
    @Override
    public void run ()
    {
        int counter = 0;
        int guess = 0;
        
        do
        {
            guess = (int) (Math.random () * 100 + 1);
            System.out.printf ("%s guesses %d \n", this.threadName, guess);
            counter++;
        }
        while (guess != number);
        
        System.out.printf ("** Correct! %s in %d guesses. \n", this.threadName, counter);
    }
}