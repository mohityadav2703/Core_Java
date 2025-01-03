package p1;

public interface ITest 
{
	public abstract void m1(int a);
	
	private void m2(int b)
	{
		System.out.println("*****Private NonStatic m2(b)*****");
		System.out.println("The value of b :"+b);
	}
	
	private static void m3(int c)
	{
		System.out.println("*****Private static m3(c)******");
		System.out.println("The value of c :"+c);
	}
	
	public static void access1(int c)
	{
		System.out.println("----static access1(c)----");
		ITest.m3(c);
	//	this.m2(b); //Error
	}
	
	public default void access2(int b,int c)
	{
		System.out.println("-----default access2(b,c)-----");
		this.m2(b);
		ITest.m3(c);
	}
}
