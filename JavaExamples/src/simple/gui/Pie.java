package simple.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * @author William
 */

// SIMPLE GUI
public class Pie extends JComponent
{
    //------------------------------------------------------------------------//
    // FIELDS
    
    private Slice[] slices = 
    {
        new Slice (5, Color.BLACK),
        new Slice (33, Color.GREEN),
        new Slice (20, Color.YELLOW),
        new Slice (15, Color.RED)
    };
    
    //------------------------------------------------------------------------//
    // CONSTRUCTOR
    
    public Pie () {}
    
    //------------------------------------------------------------------------//
    // OVERRIDED FUNCTIONS

    @Override
    public void paint (Graphics graphics)
    {
        drawPie ((Graphics2D) graphics, this.getBounds (), slices);
    }
    
    //------------------------------------------------------------------------//
    // HELPER FUNCTIONS

    private void drawPie (Graphics2D graphics2D, Rectangle area, Slice[] slices)
    {
        double total = 0.0D;
        for (Slice slice : slices)
        {
            total += slice.getValue ();
        }
        
        double currentValue = 0.0D;
        int startAngle = 0;
        for (Slice slice : slices)
        {
            startAngle = (int) (currentValue * 360 / total);
            int arcAngle = (int) (slice.getValue () * 360 / total);
            graphics2D.setColor (slice.getColor ());
            graphics2D.fillArc (area.x, area.y, area.width, area.height, startAngle, arcAngle);
            currentValue += slice.getValue ();
        }
    }
}