package p1;

public class ClassB extends ClassA
{
	public int x;
	public static int y;
	
	public void m2()
	{
		System.out.println("*****Child Class Instance m2()*****");
		System.out.println("The Value of x :"+x);
		System.out.println("The Value of y :"+y);
	}
	public static void m22()
	{
		System.out.println("****child class static m22()****");
		//System.out.println("The Value of x: "+x);
		System.out.println("The value of y:"+y);
	}
}
