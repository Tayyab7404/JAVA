// Demonstration of Choice Lists:

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code = "ChoiceDemo" width = 300 height = 180></applet> */

public class ChoiceDemo extends Applet implements ItemListener
{
    Choice os, browser;
    String msg = "";

    public void init()
    {
        os = new Choice();
        browser = new Choice();
        
        os.add("Windows XP");
        os.add("Windows Vista");
        os.add("Windows 7");
        os.add("Windows 10");
        os.add("Solaris");
        os.add("Linux");
        os.add("Mac OS");

        browser.add("Google Chrome");
        browser.add("Microsoft Edge");
        browser.add("Mozilla Firefox");
        browser.add("Safari");
        browser.add("Internet Explorer");

        add(os);
        add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        setBackground(Color.black);
        setForeground(Color.white);
        
        msg = "Current OS: ";
        msg += os.getSelectedItem();
        g.drawString(msg,6,120);
        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg,6,140);
    }
}