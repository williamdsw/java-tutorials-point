package strings;

/**
 * @author William
 */

// STRINGS
public class RemoveCharAtIndex
{
    //------------------------------------------------------------------------//
    // MAIN
    
    public static void main (String[] args)
    {
        // Data
        String phrase = "It's a wonderful world, an wonderful place";
        String otherPhrase = removeChatAt (phrase, 20);
        
        // Output
        System.out.println (phrase);
        System.out.println (otherPhrase);
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    private static String removeChatAt (String string, int position)
    {
        return string.substring (0, position) + string.substring (position + 1);
    }
}