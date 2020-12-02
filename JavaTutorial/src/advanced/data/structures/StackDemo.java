package advanced.data.structures;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author William
 */
public class StackDemo
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private static final Stack TEAMS = new Stack ();
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    private static void pushElement (String team)
    {
        TEAMS.push (team);
        System.out.printf (" %s was pushed to Stack \n", team);
    }
    
    private static void popElement ()
    {
        String team = (String) TEAMS.pop ();
        System.out.printf (" %s was popped to Stack \n", team);
    }
    
    //------------------------------------------------------------------------//
    // MAIN
    
    public static void main (String[] args)
    {
        pushElement ("Milan");
        pushElement ("Juventus");
        pushElement ("Internazionale");
        pushElement ("Lazio");
        pushElement ("Roma");
        System.out.println (TEAMS);
        
        popElement ();
        popElement ();
        popElement ();
        popElement ();
        popElement ();
        System.out.println (TEAMS);
        
        try
        {
            popElement ();
        }
        catch (EmptyStackException exception)
        {
            System.out.println ("No more teams...");
        }
    }
}