// Demonstration of Labels:

import java.awt.*;
import java.applet.*;

/* <applet code="LabelDemo" width=300 height=200></applet> */

public class LabelDemo extends Applet 
{
    Label one = new Label("One",Label.RIGHT);
    Label two = new Label("Two",Label.CENTER);
    Label three = new Label("Three",Label.RIGHT);

    public void init() 
    {
        setBackground(Color.black);
        setForeground(Color.white);
        
        // add labels to applet window
        add(one);
        add(two);
        add(three);
    }
}