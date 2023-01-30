// week 7:

package p1;

class SamePackage 
{
    void msg()
    {
        Protection p = new Protection();
		
        System.out.println("SamePackage class msg() method");
        System.out.println("Default variable: " + p.a);
        System.out.println("Private members cannot be accessed here");
        System.out.println("Protected variable: " + p.c);
        System.out.println("Public variable: " + p.d + "\n");
    }    
}