package directories;

import java.io.File;

/**
 * @author William
 */

// DIRECTORIES
public class CheckHidden
{
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS
    
    private static boolean checkIfIsHidden (File file)
    {
        return file.isHidden ();
    }
    
    //------------------------------------------------------------------------//
    // MAIN
    
    public static void main (String[] args)
    {
        // Data
        boolean isDirHidden = checkIfIsHidden (new File ("build"));
        boolean isFileHidden = checkIfIsHidden (new File ("build.xml"));
        
        // Output
        System.out.printf ("build directory %s hidden! \n", isDirHidden ? "is" : "is not");
        System.out.printf ("build.xml file %s hidden! \n", isFileHidden ? "is" : "is not");
    }
}