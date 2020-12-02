package data.structure;

/**
 * @author William
 */
public class Employee
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private String firstName;
    private String lastName;
    
    //------------------------------------------------------------------------//
    // CONSTRUCTORS

    public Employee () {}
    public Employee (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //------------------------------------------------------------------------//
    // GETTERS / SETTERS

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }
    
    //------------------------------------------------------------------------//
    // OVERRIDED

    @Override
    public String toString ()
    {
        return String.format ("%s %s", this.getFirstName (), this.getLastName ());
    }
}