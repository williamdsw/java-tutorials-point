package methods;

/**
 * @author William
 */

// METHODS - OVERRIDING
public class Figure
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    protected double x;
    protected double y;
    
    //------------------------------------------------------------------------//
    // CONSTRUTORS
    
    public Figure () {}
    public Figure (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    public double getArea ()
    {
        System.out.println ("Getting area for figure...");
        return x * y;
    }
}