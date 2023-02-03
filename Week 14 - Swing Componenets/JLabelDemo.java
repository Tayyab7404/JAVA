// Demonstration of JLabel:

import javax.swing.*; 

class JLabelDemo
{  
    public static void main(String args[])  
    {  
        JFrame f= new JFrame("JLabel Demo"); 

        JLabel l1,l2,l3;  

        l1=new JLabel("Hello,");  
        l1.setBounds(50,50, 200,30);  

        l2=new JLabel("Good Morning everyone!");  
        l2.setBounds(50,70, 200,30); 

        l3=new JLabel("My name is Tayyab.");  
        l3.setBounds(50,90, 200,30); 

        f.add(l1); 
        f.add(l2); 
        f.add(l3);

        f.setSize(300,300);  
        f.setLayout(null); 
        f.setVisible(true);  
    }  
}