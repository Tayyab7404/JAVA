// Passing Parameters to Applets:

import java.applet.*;
import java.awt.*;

/* 
<applet code="PassParameters" width=300  height=200>
<param name="Name" value="Tayyab">
<param name="Designation" value="Data Engineer">
<param name="Company" value="Amazon">
<param name="Salary"  value=80000>
</applet> 
*/

public class PassingParameters extends Applet
{
	public void paint(Graphics g)
	{
		int d=0;
		g.drawString("Name : " + getParameter("Name"), 50, 50);
		g.drawString("Designation : " + getParameter("Designation"), 50, 70);
		g.drawString("Company : " + getParameter("Company"), 50, 90);
		d = Integer.parseInt(getParameter("Salary"));
		g.drawString("Salary : " + d, 50, 110);
	}
}
