// week 4:

package week4;

import java.util.Scanner;

class Employee
{	
	String name,id;
	double salary;

	void readEmployee()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter employee Name: ");
		name = scan.nextLine();

		System.out.print("Enter employee Id: ");
		id = scan.nextLine();

		System.out.print("Enter employee Salary: $ ");
		salary = scan.nextDouble();
	}
}

class PermanentEmployee extends Employee
{
	void printEmployee()
	{
		salary += salary * 0.05;
		System.out.println("\n\nEmployee Name: "+name);
		System.out.println("Employee Id: "+id);
		System.out.println("Final Salary after increment: $ "+salary);
	}
}

class TemporaryEmployee extends Employee
{
	void printEmployee()
	{
		salary += salary * 0.035;
		System.out.println("\n\nEmployee Name: "+name);
		System.out.println("Employee Id: "+id);
		System.out.println("Final Salary after increment: $ "+salary);
	}
}

class SalaryIncrement
{
	public static void main(String args[])
	{
		System.out.println("Temporary Employee: ");
		TemporaryEmployee T = new TemporaryEmployee();
		T.readEmployee();
		T.printEmployee();

		System.out.println("\n\nPermanent Employee:");
		PermanentEmployee P = new PermanentEmployee();
		P.readEmployee();
		P.printEmployee();
	}
}