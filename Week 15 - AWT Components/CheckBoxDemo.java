// Demonstration of CheckBox:

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "CheckBoxDemo" width = 250 height = 200></applet> */

public class CheckBoxDemo extends Applet implements ItemListener
{
    String msg = "";

    Checkbox winXP, winVista, solaris, mac;

    public void init()
    {
        setBackground(Color.black);
        setForeground(Color.white);
        
        winXP = new Checkbox("Windows XP",false);
        winVista = new Checkbox("Windows Vista",false);
        solaris = new Checkbox("Solaris",false);
        mac = new Checkbox("Mac OS",false);

        add(winXP);
        add(winVista);
        add(solaris);
        add(mac);

        winXP.addItemListener(this);
        winVista.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }

    public void paint(Graphics g) 
    {
        msg = "Current state: ";
        g.drawString(msg, 6, 80);

        msg = " Windows XP: " + winXP.getState();
        g.drawString(msg, 6, 100);

        msg = " Windows Vista: " + winVista.getState();
        g.drawString(msg, 6, 120);

        msg = " Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);

        msg = " Mac OS: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}