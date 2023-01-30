// week 7:

package p2;

import p1.*;

class Protection2 extends Protection
{
    void msg()
    {
        System.out.println("Protection2 class msg() method");
        System.out.println("Default and Private members cannot be accessed here");
        System.out.println("Protected variable: " + c);
        System.out.println("Public variable: " + d + "\n");
    }
}