package p1;

public class ClassA 
{
	public int a;
	public static int b;
	
	public void m1()
	{
		System.out.println("******ParentClass Instance m1()******");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
	public static void m11()
	{
		System.out.println("****ParentClass static m11()****");
		//System.out.println("The Value of a :" +a);
		System.out.println("The Value Of b :"+b);
		
	}
}
