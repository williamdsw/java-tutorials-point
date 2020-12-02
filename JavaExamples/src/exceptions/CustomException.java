package exceptions;

/**
 * @author William
 */

// EXCEPTIONS
public class CustomException extends Exception
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private String message;

    //------------------------------------------------------------------------//
    // CONSTRUCTOR
    
    public CustomException () {}
    public CustomException (String message)
    {
        this.message = message;
    }

    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS
    
    @Override
    public String toString ()
    {
        return message;
    }
}