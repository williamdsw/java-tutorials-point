package advanced.generics;

/**
 * @author William
 * @param <T>
 */

// GENERIC CLASS
public class Box<T>
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private T value;
    
    //------------------------------------------------------------------------//
    // CONSTRUCTORS
    
    public Box () {}
    public Box (T value)
    {
        this.value = value;
    }

    //------------------------------------------------------------------------//
    // GETTERS / SETTERS
    
    public T get ()
    {
        return value;
    }

    public void add (T value)
    {
        this.value = value;
    }
}