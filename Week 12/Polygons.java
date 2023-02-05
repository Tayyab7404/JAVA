// Draw Polygons:

import java.awt.*;
import java.applet.*;

/*
<applet code="Polygons" width=300 height=300></applet>
*/

public class Polygons extends Applet 
{
    public void paint(Graphics g) 
    {
        
        int xpoints[] = {50, 200, 50, 200, 50};
        int ypoints[] = {50, 50, 200, 200, 50};
        int num = 5;

        setBackground(Color.yellow);
        setForeground(Color.black);
        g.drawString("Hour Glass: ", 50, 30);
        g.drawPolygon(xpoints, ypoints, num);
    }
}