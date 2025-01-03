package p1;

public interface ITest 
{
	public abstract void m1(int a);
	public static void m2(int b)
	{
		System.out.println("****static m2(b)****");
		System.out.println("The value of b :"+b);
	}
	public default void m3(int c)
	{
		System.out.println("****default m3(c)****");
		System.out.println("The value of c :"+c);
	}
}
