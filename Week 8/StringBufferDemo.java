// week 8:

package week8;

class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("RVR & JC College");
        StringBuffer str2 = new StringBuffer("Hello Java");
		
		System.out.println("Original string buffer: " + str);
        System.out.println("str.capacity(): " + str.capacity());
        System.out.println("str.length(): " + str.length());
        System.out.println("Second string buffer: " + str2);
        System.out.println("str2.capacity(): " + str2.capacity());
		System.out.println("str.append(' of Engg'): " + str.append(" of Engg"));
		System.out.println("str.reverse(): " + str.reverse());
		
		str.reverse();
		
		System.out.println("str.charAt(6): " + str.charAt(6));
		System.out.println("str.codePointAt(6): " + str.codePointAt(6));
		System.out.println("str.codePointBefore(6): " + str.codePointBefore(6));
		System.out.println("str.delete(3, 6): " + str.delete(3, 6));
		System.out.println("str.deleteCharAt(19): " + str.deleteCharAt(19));
		System.out.println("str.indexOf('J'): " + str.indexOf("J"));
	}	
}