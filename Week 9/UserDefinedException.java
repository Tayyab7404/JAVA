// User Defined Exception:

import java.util.Scanner;

class UnderAgeException extends Exception
{
	void msg()
	{
		System.out.println("Ineligible for voting due to less age!");
	}
}

class UserDefinedException
{
	public static void main(String args[])
	{
		try
		{
			Scanner scan =  new Scanner(System.in);

			System.out.print("Enter your age: ");
			int age = scan.nextInt();

			if(age<18) throw new UnderAgeException();
			else System.out.println("Eligible to vote!");
		}
	
		catch(UnderAgeException e)
		{
			e.msg();
		}
	}
}