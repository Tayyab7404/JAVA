// Demonstration of JCheckBox

import javax.swing.*;  

public class JCheckBoxDemo
{  
    JCheckBoxDemo()
    {  
        JFrame f = new JFrame("JCheckBox Demo");  

        System.out.println("Enter your preferred Language: ");

        JCheckBox CheckBox1 = new JCheckBox("C++", false);  
        CheckBox1.setBounds(100,100, 200,50);  

        JCheckBox CheckBox2 = new JCheckBox("Java", false);  
        CheckBox2.setBounds(100,150, 200,50);  

        f.add(CheckBox1);  
        f.add(CheckBox2);  

        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
       public static void main(String args[])  
    {  
       new JCheckBoxDemo();  
    }
}  