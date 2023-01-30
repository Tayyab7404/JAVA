// week 4:

package week4;

import java.util.Scanner;

class Student
{
	String name,rollno;

	void readStudent()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter student Name: ");
		name = scan.nextLine();

		System.out.print("Enter student Roll number: ");
		rollno = scan.nextLine();
	}
}

class Test extends Student
{
	int marks[] = new int[6];

	void readMarks()
	{
		Scanner scan = new Scanner(System.in);

		for(int i=0;i<6;i++)
		{
			System.out.print("Enter marks in Subject "+ (i+1) +": ");
			marks[i] = scan.nextInt();
		}
 	}
}

class Result extends Test
{
	int total = 0;

	void calculateTotal()
	{
		for(int i:marks)
		{
			total += i;
		}
	}
	
	void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("Total marks: "+total);
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		Result S = new Result();

		S.readStudent();
		S.readMarks();
		S.calculateTotal();
		S.displayDetails();
	}
}