// Demonstration of CheckBox Group:

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code = "CBGroupDemo" width = 250 height = 200></applet> */

public class CBGroupDemo extends Applet implements ItemListener
{
    String msg = "";

    Checkbox winXP, winVista, solaris, mac;
    CheckboxGroup cbg;

    public void init()
    {
        cbg = new CheckboxGroup();

        winXP = new Checkbox("Windows XP",cbg,false);
        winVista = new Checkbox("Windows Vista",cbg,false);
        solaris = new Checkbox("Solaris",cbg,false);
        mac = new Checkbox("Mac OS",cbg,false);

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
        setBackground(Color.black);
        setForeground(Color.white);
        
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 6, 100);
    }
}