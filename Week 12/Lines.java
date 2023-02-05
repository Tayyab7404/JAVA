// Draw Lines:

import java.awt.*;
import java.applet.*;

/* 
<applet code="Lines" width=300 height=300></applet> 
*/

public class Lines extends Applet 
{
	public void paint(Graphics g) 
	{
		Color c1 = new Color(255, 0, 0);
		Color c2 = new Color(0, 255, 0);
		Color c3 = new Color(0, 0, 255);

		setBackground(Color.white);

		g.setColor(c1);
		g.drawLine(0, 0, 100, 100);
		g.drawLine(0, 100, 100, 0);
		
		g.setColor(c2);
		g.drawLine(0, 100, 100, 200);
		g.drawLine(100, 100, 0, 200);
		
		g.setColor(c3);
		g.drawLine(100, 0, 200, 100);
		g.drawLine(100, 100, 200, 0);
	}
}