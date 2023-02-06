// Demonstration of JTree:

import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  

public class JTreeDemo
{  
    JFrame f;  

    JTreeDemo()
    {  
        f = new JFrame();  

        DefaultMutableTreeNode Style = new DefaultMutableTreeNode("Style");  
        DefaultMutableTreeNode Color = new DefaultMutableTreeNode("Color");  
        DefaultMutableTreeNode Font = new DefaultMutableTreeNode("Font");  

        Style.add(Color);  
        Style.add(Font); 

        DefaultMutableTreeNode Red=new DefaultMutableTreeNode("Red");  
        DefaultMutableTreeNode Blue=new DefaultMutableTreeNode("Blue");  
        DefaultMutableTreeNode Black=new DefaultMutableTreeNode("Black");  
        DefaultMutableTreeNode Green=new DefaultMutableTreeNode("Green"); 

        Color.add(Red);
        Color.add(Blue); 
        Color.add(Black); 
        Color.add(Green);

        DefaultMutableTreeNode Calibri=new DefaultMutableTreeNode("Calibri");
        DefaultMutableTreeNode TimesNewRoman = new DefaultMutableTreeNode("TimesNewRoman");

        Font.add(Calibri);
        Font.add(TimesNewRoman);

        JTree jt=new JTree(Style);  
        f.add(jt);  
        f.setSize(300,300);  
        f.setVisible(true);  
    }

    public static void main(String[] args) 
    {  
        new JTreeDemo();  
    }
}  
