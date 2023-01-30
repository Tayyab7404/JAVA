// week 8:

package week8;

class StringDemo
{
	public static void main(String args[])
	{
		String str = "    Hello World"; 
		
		System.out.println("Original string: " + str);
		System.out.println("trim(): " + str.trim());
		
		str = str.trim();
		
		System.out.println("toLowerCase(): " + str.toLowerCase());
		System.out.println("toUpperCase(): " + str.toUpperCase());
		System.out.println("length(): " + str.length());
		System.out.println("charAt(6): " + str.charAt(6));
		System.out.println("indexOf('o'): " + str.indexOf('o'));
		System.out.println("substring(6, 11): " + str.substring(6, 11));
		System.out.println("replace('World', 'Java'): " + str.replace("World", "Java"));
		System.out.println("equalsIgnoreCase('hello WORLD'): " + str.equalsIgnoreCase("hello WORLD"));
		System.out.println("contains('Hello'): " + str.contains("Hello"));
	}
}