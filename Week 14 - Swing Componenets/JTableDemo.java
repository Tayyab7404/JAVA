// Demonstration of JTable:

import javax.swing.*;    
public class JTableDemo 
{    
    JFrame f;    
    JTableDemo()
    {    
        f=new JFrame();    

        String data[][]={ {"101","Amit","67000"},
                          {"102","Jai","78000"},
                          {"101","Sachin","70000"}};

        String column[]={"ID","NAME","SALARY"};   

        JTable JT = new JTable(data,column);    

        JT.setBounds(30,40,200,300);   

        JScrollPane sp=new JScrollPane(JT);    

        f.add(sp);          
        f.setSize(400,400);    
        f.setVisible(true);    
    }     

    public static void main(String[] args) 
    {    
        new JTableDemo();    
    }    
}  