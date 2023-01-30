// week 3:

package week3;

import java.util.Scanner;

class TimeDemo{
	TimeDemo(int h, int m, int s)
	{
		System.out.printf("Time is: %02d:%02d:%02d\n",h,m,s);
	}
	
	TimeDemo(int h, int m, int s, String meridian)
	{
		System.out.printf("Time is: %02d:%02d:%02d %2s\n",h,m,s,meridian);
	}

	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);

		System.out.print("Enter hours: ");
		int h = scan.nextInt();

		System.out.print("Enter minutes: ");
		int m = scan.nextInt();

		System.out.print("Enter seconds: ");
		int s = scan.nextInt();

		scan.nextLine();
		System.out.print("Enter AM/PM: ");
		String meridian = scan.nextLine();

        TimeDemo t1 = new TimeDemo(h, m, s, meridian);
		TimeDemo t2 = new TimeDemo(h, m, s);
    }
}