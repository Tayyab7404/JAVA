// week 9:

import java.util.Scanner;

class ExceptionHandling
{
	public static void main(String args[])
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			
			int sum = 0;
			
			System.out.print("Enter size of the array: ");
			int n = scan.nextInt();
			
			int arr[] = new int[n];
			
			System.out.print("Enter elements of the array: ");
			for(int i=0;i<n;i++)
			{
				arr[i] = scan.nextInt();
				sum += arr[i];
			}
			
			System.out.println("Sum of the array elements: " + sum);
		}
		
		catch (NegativeArraySizeException e)
		{
			System.out.println(e);
			System.out.println("Array size cannot be negative");
		}
	}
}