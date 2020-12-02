package object.oriented.inheritance;

/**
 * @author William
 */
public class Calculation
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    protected int result;
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    public void addition (int x, int y)
    {
        result = x + y;
        System.out.printf ("%d + %d = %d \n", x, y, result);
    }
    
    public void substraction (int x, int y)
    {
        result = x - y;
        System.out.printf ("%d - %d = %d \n", x, y, result);
    }
}