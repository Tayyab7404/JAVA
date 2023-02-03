// Demonstration of Buttons:

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code = "ButtonDemo" width = 250 height = 150></applet> */

public class ButtonDemo extends Applet implements ActionListener
{
    String msg = "";

    Button yes, no, maybe;

    public void init()
    {
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }  

    public void actionPerformed(ActionEvent ae)
    {
        String cmd = ae.getActionCommand();

        if(cmd.equals("Yes")) msg = "You pressed Yes.";
        else if(cmd.equals("No")) msg = "You pressed No.";
        else  msg = "You pressed Undecided.";
        
        repaint();
    }

    public void paint(Graphics g) 
    {
        setBackground(Color.black);
        setForeground(Color.white);
        
        g.drawString(msg, 6, 100);
    }
}