// week 4:

package week4;

import java.util.Scanner;

class Employee
{
	String name, id, designation;

	void readEmployee()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter employee Name: ");
		name = scan.nextLine();

		System.out.print("Enter employee Id: ");
		id = scan.nextLine();

		System.out.print("Enter employee Designation: ");
		designation = scan.nextLine();
	}
}

class Salary extends Employee
{
	double bp, hra, da, pf, np;

    void readSalary()
   	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Basic Pay of employee: $");
		bp = sc.nextDouble();

		System.out.print("Enter House Rent Allowance of employee: $");
		hra = sc.nextDouble();

		System.out.print("Enter Dearness Allowance of employee: $");
		da = sc.nextDouble();

		System.out.print("Enter Provident Fund of employee: $");
		pf = sc.nextDouble();
    }

	void calculateSalary()
	{
		np = bp + hra + da - pf;
	}

	void displayEmployee()
	{
		System.out.println("\n\nEmployee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Designation: " + designation);
		System.out.println("Net salary: $" + np);
	}
}

class SalaryDemo
{
	public static void main(String args[])
	{
		Salary obj = new Salary();
		
		obj.readEmployee();
		obj.readSalary();
		obj.calculateSalary();
		obj.displayEmployee();
	}
}