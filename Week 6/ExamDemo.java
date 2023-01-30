// week 6:

package week6;

import java.util.Scanner;

interface Student
{
	void getValue();
}

interface Department
{
	void getAttendance();
}

class Exam implements Student, Department
{
	Scanner scan = new Scanner(System.in);

	String name,rollno,Class;
	double Att[] = new double[6];
	double finalAtt;

	public void getValue()
	{
		System.out.print("Enter student Name: ");
		name = scan.nextLine();
		System.out.print("Enter student Roll no: ");
		rollno = scan.nextLine();
		System.out.print("Enter student Class: ");
		Class = scan.nextLine();
	}

	public void getAttendance()
	{
		System.out.println("Enter attendance of 6 months: ");
		for (int i = 0; i < 6; i++)
		{
			System.out.print("Month "+ (i+1) + ": ");
			Att[i] = scan.nextDouble();
		}
	}

	void calAttendance()
	{
		for(double i:Att)
		{
			finalAtt += i;
		}
		
		finalAtt /= 6;
	}

	boolean eligible()
	{
		return finalAtt >= 90;
	}
	
	void PrintEligible()
    {
		System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollno);
        System.out.println("Class : " + Class);
		System.out.println("Final Attendance : " + finalAtt);

		if (eligible())
		{
			System.out.println("Eligible to write exams");
		}

		else
		{
			System.out.println("Ineligible to write exams!");
		}
    }
}

class ExamDemo
{
	public static void main(String args[])
	{
		Exam E = new Exam();

		E.getValue();
		E.getAttendance();
		E.calAttendance();
		E.PrintEligible();
	}
}