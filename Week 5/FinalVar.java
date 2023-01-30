// week 5;

package week5;

public class FinalVar 
{
    final int a = 200;
	
    void run()
    {
        System.out.println("We cannot change the value of a final variable");
    }    

    public static void main(String[] args) 
	{
        FinalVar F = new FinalVar();
        F.run();
    }
}