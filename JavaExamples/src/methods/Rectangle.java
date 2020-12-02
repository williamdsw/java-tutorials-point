package methods;

/**
 * @author William
 */

// METHODS - OVERRIDING
public class Rectangle extends Figure
{
    //------------------------------------------------------------------------//
    // CONSTRUTOR
    
    public Rectangle (double x, double y)
    {
        super (x, y);
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    @Override
    public double getArea ()
    {
        System.out.println ("Getting area for rectangle...");
        return x * y;
    }
}