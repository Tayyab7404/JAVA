// Demonstration of Labels:

import java.awt.*;
import java.applet.*;

/* <applet code="LabelDemo" width=300 height=200></applet> */

public class LabelDemo extends Applet 
{
    Label one,two,three;

    public void init() 
    {
        setBackground(Color.black);
        setForeground(Color.white);
        
        one = new Label("One",Label.RIGHT);
        two = new Label("Two",Label.CENTER);
        three = new Label("Three",Label.RIGHT);

        // add labels to applet window
        add(one);
        add(two);
        add(three);
    }
}
