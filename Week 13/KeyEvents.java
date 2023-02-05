// Demonstration of key event handlers

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="KeyEvents" width=300 height=200></applet>
*/

public class KeyEvents extends Applet implements KeyListener 
{
    String msg = "";
    int X = 10, Y = 20; // output coordinates

    public void init() 
    {
        setBackground(Color.yellow);
        setForeground(Color.black);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) 
    {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent ke) 
    {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) 
    {
        msg += ke.getKeyChar();
        repaint();
    }

    // Display keystrokes.
    public void paint(Graphics g) 
    {
        g.drawString(msg, X, Y);
    }
}