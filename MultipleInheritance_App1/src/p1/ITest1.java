package p1;

public interface ITest1 
{
	public abstract void dis1(int a);
	public static void dis2(int b)
	{
		System.out.println("****ITest1 dis2(b)****");
		System.out.println("The value of b :"+b);
	}
	public default void dis3(int c)
	{
		System.out.println("****ITest dis3(c)****");
		System.out.println("The value of c :"+c);
	}
}
