// week 6:

package week6;

abstract class Shape
{
	double dim1, dim2;

	abstract void PrintArea();
}

class Rectangle extends Shape
{
	Rectangle(double length, double breadth)
	{
		dim1 = length;
		dim2 = breadth;
	}

	void PrintArea()
	{
		System.out.println("Area of Rectangle = "+(dim1 * dim2));
	}
}

class Triangle extends Shape
{
	Triangle(double base, double height)
	{
		dim1 = base;
		dim2 = height;
	}

	void PrintArea()
	{
		System.out.println("Area of Triangle = "+(0.5 * dim1 * dim2));
	}
}

class Circle extends Shape
{
	Circle(double radius)
	{
		dim1 = radius;
	}

	void PrintArea()
	{
		System.out.println("Area of Circle = "+(Math.PI * dim1 * dim1));
	}
}

class ShapeDemo
{
	public static void main(String args[])
	{
		Rectangle R = new Rectangle(10,8);
		Triangle T = new Triangle(10,8);
		Circle C = new Circle(10);

		R.PrintArea();
		T.PrintArea();
		C.PrintArea();
	}
}