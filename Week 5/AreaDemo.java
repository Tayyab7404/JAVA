// week 5:

package week5;

class Figure
{
	double area(double side)
	{
		return side*side;
	}
}

class Rectangle extends Figure
{
	double area(double length, double breadth)
	{
		return length*breadth;
	}
}

class Triangle extends Figure
{
	double area(double base, double height)
	{
		return(0.5)*base*height;
	}
}

class AreaDemo
{
	public static void main(String args[])
	{
		Rectangle R = new Rectangle();
		Triangle T = new Triangle();
		
		System.out.println("Area of Rectangle = "+R.area(10,5));
		System.out.println("Area of Triangle = "+T.area(10,5));
	}
}