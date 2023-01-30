// week 5:

package week5;

class base
{
    final void run()
    {
        System.out.println("Running in final method");
    }
}

public class FinalMethod extends base
{
    void run2()
    {
        System.out.println("We cannot override a final method");
    }
	
    public static void main(String[] args) 
	{
        FinalMethod F = new FinalMethod();
        F.run();
        F.run2();
    }
}