//static method overloading process by using 'super' and 'this' keyword

package p1;

public class PClass {
	public static int x=50;
	
	public static void m(int a,int b)
	{
		System.out.println("The Value of b :"+b);
	}
	public static void m(int a)
	{
		System.out.println("The Value Of a :"+a);
	}
	
}
