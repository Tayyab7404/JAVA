// week 5:

package week5;

class Room
{
	double area()
	{
		return 1;
	}

	double area(double side)
	{
		return side * side;
	}

	double area(double length, double breadth)
	{
		return length * breadth;
	}
}

class RoomDemo
{
	public static void main(String[] args)
	{
		Room R = new Room();

		System.out.println("Area using no parameters: " + R.area());
		System.out.println("Area using 1 parameter: " + R.area(15));
		System.out.println("Area using 2 parameters: " + R.area(12, 15));
    }
}