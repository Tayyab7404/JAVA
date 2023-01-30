// week 2:

package week2;

import java.util.Scanner;

class Student 
{
    String name, roll;

    Student(String name, String roll)
    {
        this.name = name;
        this.roll = roll;
    }
}

class ThisDemo{
	public static void main(String[] args) {
        	String name, roll;

        	Scanner scan = new Scanner(System.in);

        	System.out.print("Enter name: ");
        	name = scan.nextLine();

        	System.out.print("Enter roll number: ");
        	roll = scan.nextLine();

        	Student s = new Student(name, roll);

        	System.out.println("Name: " + s.name);
        	System.out.println("Roll no: " + s.roll);

        	scan.close();
    	}
}