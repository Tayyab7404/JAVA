// week 5:

package week5;

final class base
{
    void run()
    {
        System.out.println("Running in final class");
    }
}

public class FinalClass // extends base
{
    void run2()
    {
        System.out.println("We cannot inherit a final class");
    }    
	
    public static void main(String[] args) {
        FinalClass F = new FinalClass();
        F.run2();
    }
}