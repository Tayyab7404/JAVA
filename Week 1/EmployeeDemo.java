// week 1:

package week1;

import java.util.Scanner;

class Employee
{
	String name,id;
	double salary;
	int time;
	
	void GetInfo()
	{	
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		name = scan.nextLine();

		System.out.print("Enter employee id: ");
		id = scan.nextLine();

		System.out.print("Enter employee salary: $");
		salary = scan.nextDouble();

		System.out.print("Enter working hours of employee per day: ");
		time = scan.nextInt();
	}

	void AddSal()
	{
		if(salary<500) salary += 10;
	}

	void AddWork()
	{
		if(time>6) salary += 5;

		System.out.println("Final salary of employee is: $" + salary);
	}
}

class EmployeeDemo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter no of employees: ");
		int n = scan.nextInt();

		Employee E[] = new Employee[n];

		for(int i=0; i<n; i++)
		{
			E[i] = new Employee();
		}

		int i=1;

		for(Employee employee:E)
		{
			System.out.println("Employee "+i+": ");
			i++;

			employee.GetInfo();
			employee.AddSal();
			employee.AddWork();
		}

		scan.close();
	}
}