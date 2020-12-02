package methods;

/**
 * @author William
 */

// METHODS
public class FactorialDemo
{
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    public static long getFactorial (long number)
    {
        if (number <= 1) return 1;
        else return number * getFactorial (number - 1);
    }

    //------------------------------------------------------------------------//
    // MAIN
    
    public static void main (String[] args)
    {
        for (int number = 0; number <= 30; number++)
        {
            long factorial = getFactorial (number);
            System.out.printf ("Factorial of %d is %d \n", number, factorial);
        }
    }
}