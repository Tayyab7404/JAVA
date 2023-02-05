import java.awt.*;
import java.applet.*;

/*
<applet code="ColorSample" width=300 height=200></applet>
*/

public class ColorSample extends Applet
{
    String msg;

    // set the foreground and background colors
    public void init() 
    {
        setBackground(Color.yellow);
        setForeground(Color.black);

        msg = "Inside init( ) --";
    }

    // Initialize the string to be displayed
    public void start() 
    {
        msg += " Inside start( ) --";
    }

    // Display msg in applet window
    public void paint(Graphics g) 
    {
        msg += " Inside paint( ).";
        g.drawString(msg, 30, 100);
    }
}