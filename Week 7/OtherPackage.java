// week 7:

package p2;

import p1.*;

class OtherPackage 
{
    void msg()
    {
		Protection p = new Protection();
		
        System.out.println("OtherPackage class msg() method");
        System.out.println("Default, Private and Protected members cannot be accessed here");
        System.out.println("Public variable: " + p.d + "\n");
    }    
}