package object.oriented.abstraction;

/**
 * @author William
 */
public abstract class Employee
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private String name;
    private String address;
    private Integer number;
    
    //------------------------------------------------------------------------//
    // CONSTRUCTORS

    public Employee () {}
    public Employee (String name, String address, Integer number)
    {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    //------------------------------------------------------------------------//
    // GETTERS / SETTERS

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public Integer getNumber ()
    {
        return number;
    }

    public void setNumber (Integer number)
    {
        this.number = number;
    }
    
    //------------------------------------------------------------------------//
    // OVERRIDED

    @Override
    public String toString ()
    {
        return String.format ("%s %s %d", this.getName (), this.getAddress (), this.getNumber ());
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    public void mailCheck ()
    {
        System.out.printf ("Mailing a check to %s of %s \n", this.getName (), this.getAddress ());
    }
    
    public abstract double computePay ();
}