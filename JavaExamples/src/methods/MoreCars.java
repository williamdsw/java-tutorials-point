package methods;

/**
 * @author William
 */

// METHODS - ENUMERATORS
public enum MoreCars
{
    //------------------------------------------------------------------------//
    // VALUES
    
    TOYOTA_AE86 (10),
    MAZDA_RX7 (15),
    SUBARU_IMPREZA (22),
    NISSAN_SKYLINE (18),
    HONDA_CIVIC (16),
    MITSUBISHI_LANCER_EVOLUTION (25),
    NISSAN_SILEIGHTY (30),
    NISSAN_SILVIA (28);
    
    //------------------------------------------------------------------------//
    // FIELDS
    
    private int price;
    
    //------------------------------------------------------------------------//
    // CONSTRUCTORS
    
    MoreCars () {}
    MoreCars (int price)
    {
        this.price = price;
    }
    
    //------------------------------------------------------------------------//
    // GETTERS
    
    public int getPrice ()
    {
        return this.price;
    }
}