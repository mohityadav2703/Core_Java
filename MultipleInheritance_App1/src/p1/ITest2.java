package p1;

public interface ITest2 
{
	public abstract void dis1(int a);
	public static void dis22(int b)
	{
		System.out.println("*****ITest2 dis2(b)******");
		System.out.println("The value of b :"+b);
	}
	public default void dis33(int c)
	{
		System.out.println("****ITest2 dis33(c)****");
		System.out.println("The value of c :"+c);
	}
}
