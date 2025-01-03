package p1;

public class Display
{
	public Display(int a)
	{
		System.out.println("****Constructor-body****");
		System.out.println("The value of a :"+a);
	}
	public void m1(int b)
	{
		System.out.println("******Instance metod******");
		System.out.println("The value of b :"+b);
	}
	public static void m2(int c)
	{
		System.out.println("****Static method****");
		System.out.println("The value of z :"+c);
	}
}
