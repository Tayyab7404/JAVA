// week 2:

package week2;

class StaticDemo{
	// static variables
	static int a = 3;
	static int b;

	// static method
	static void method(int x){
		System.out.println("static method initialized");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("x = "+x);
	}

	// static block
	static{
		System.out.println("static block initialized");
		b = a * 2;
	}

	public static void main(String args[]){
		method(12);
	}
}