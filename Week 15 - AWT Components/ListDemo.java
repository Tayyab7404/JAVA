// Demonstration of Lists:

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code = "ListDemo" width=300 height=300 ></applet> */

public class ListDemo extends Applet implements ActionListener
{
    List os, browser;
    String msg = "";

    public void init()
    {
        os = new List(4, false);
        browser = new List(4, false);

        os.add("Windows 7");
        os.add("Windows 10");
        os.add("Linux");
        os.add("Mac OS");

        browser.add("Google Chrome");
        browser.add("Mozilla Firefox");
        browser.add("Microsoft Edge");
        browser.add("Internet Explorer");

        add(os);
        add(browser);

        os.select(0);
        browser.select(0);

        os.addActionListener(this);
        browser.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        setBackground(Color.black);
        setForeground(Color.white);

        int index[];

        msg = "Current OS: ";
        index = os.getSelectedIndexes();
        
        for(int i=0; i<index.length; i++)
        {
            msg += os.getItem(index[i]) + " ";
        }

        g.drawString(msg, 6, 120);

        msg = "Current Browser: ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}