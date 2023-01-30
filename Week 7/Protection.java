// week 7:

package p1;

public class Protection 
{
	int a = 10;
    private int b = 15;
    protected int c = 20;
    public int d = 25;

    void msg()
    {
        System.out.println("Protection class msg() method");
		System.out.println("Default variable: " + a);
        System.out.println("Private variable: " + b);
        System.out.println("Protected variable: " + c);
        System.out.println("Public variable: " + d + "\n");
    }
}